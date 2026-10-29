class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        double median;
        int a=nums1.length;
        int b=nums2.length;
        int result[]=new int[a+b];
        while(i<a && j<b){
            if(nums1[i]<=nums2[j]){
                result[k++]=nums1[i++];
            }
            else
            {
                result[k++]=nums2[j++];
            }
        }
        while(i<a)
           result[k++]=nums1[i++];
        while(j<b)
           result[k++]=nums2[j++];
        int total=a+b;
        if(total%2==1)
        {
            median=result[total/2];
        }
        else
        {
            median=(result[total/2]+result[(total/2)-1])/2.0;
        }
        return median;

    }
}