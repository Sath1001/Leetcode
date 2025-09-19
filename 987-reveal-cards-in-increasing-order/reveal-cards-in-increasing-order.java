class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> Q= new LinkedList<>();
        int n=deck.length;
        int [] res=new int [n];
        for(int i=0;i<n;i++)
            Q.offer(i);
        Arrays.sort(deck);
        for(int a:deck)
        {
            int i =Q.poll();
            res[i]=a;
            Q.offer(Q.poll());

        }
        return res;

        
    }
}