class Solution {
    public int totalMoney(int n) {
        int s=0;
        for(int i =0;i<n;i++){
            s += ((i/7)+1)+(i%7);
           
        }
        
       return s; 
    }
}