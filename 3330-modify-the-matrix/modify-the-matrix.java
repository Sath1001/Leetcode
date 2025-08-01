class Solution {
    public int[][] modifiedMatrix(int[][] A) {
        for(int j=0; j<A[0].length;j++){
            int mx=0;
            for(int i =0;i<A.length;i++){
                if (A[i][j]>mx)
                    mx= A[i][j];
            }
            for(int i =0;i<A.length;i++){
                if (A[i][j]==-1)
                    A[i][j]=mx;
        }
        }
        return A;
        
    
}
}