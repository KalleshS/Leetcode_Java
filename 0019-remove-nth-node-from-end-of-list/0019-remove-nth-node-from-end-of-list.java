
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(n==count){
            head=head.next;
            return head;
        }
        temp=head;
        int i=1;
        while(i<count-n){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;

        
    }
}