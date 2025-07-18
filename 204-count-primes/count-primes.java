class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean [] p =new boolean[n];
        for(int i=2; i*i<=n;i++){
            if(!p[i]){
                for(int j=i*i; j<n;j+=i)
                    p[j]=true;

            }
        }
            for(int i=2; i<=n-1;i++){
                if(!p[i])
                    c++;
            }
        
        
        return c;
    }
}