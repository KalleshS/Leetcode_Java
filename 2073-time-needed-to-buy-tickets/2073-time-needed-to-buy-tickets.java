class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.offer(i);
        }
        int t=0;
        while(!q.isEmpty()){
            int x=q.poll();
            tickets[x]--;
            t++;
            if(tickets[x]>0){
                q.offer(x);
            }
            if(x==k && tickets[x]==0){
                return t;
            }
        }

        
        return t;
        
    }
}