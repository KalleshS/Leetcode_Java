class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=0;
        int maxcurr=0;
        int maxsum=Integer.MIN_VALUE;
        int mincurr=0;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            maxcurr=Math.max(nums[i],maxcurr+nums[i]);
            maxsum=Math.max(maxcurr,maxsum);
            mincurr=Math.min(nums[i],mincurr+nums[i]);
            minsum=Math.min(mincurr,minsum);
            totalSum+=nums[i];
        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(totalSum-minsum,maxsum);
    }
}