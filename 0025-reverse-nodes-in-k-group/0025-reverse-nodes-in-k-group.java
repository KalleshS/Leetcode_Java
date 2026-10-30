
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1||head==null){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        while(true){
            ListNode temp = curr;
            for (int i = 0; i < k; i++) {
                if (temp == null) {
                    return head;
                }
                temp = temp.next;
            }

           ListNode last=prev;
           ListNode newend=curr;
           for(int i=0;i<k && curr!=null;i++){
             ListNode next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
           }
           if(last!=null){
             last.next=prev;
           }
            else{
             head=prev;
          } 
          newend.next=curr;
          if(curr==null){
            break;
          }
         prev=newend;
    }
     return head;
}
}