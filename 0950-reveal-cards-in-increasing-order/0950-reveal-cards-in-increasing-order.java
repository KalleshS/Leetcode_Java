class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q=new LinkedList<>();
        Arrays.sort(deck);
        int[] result=new int[deck.length];
        for(int i=0;i<deck.length;i++){
            q.offer(i);
        }
        int i=0;
        while(!q.isEmpty()){
            int x=q.poll();
            result[x]=deck[i];
            if(!q.isEmpty()){
              int y=q.poll();
              q.offer(y);
            }
            i++;
        }
        return result;
    }
}