class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i =2; i<=n ; i++){
            if(rotate(i))
                c++;
        }
        return c;
    }
    public boolean rotate(int i){
        boolean res= false;
        while(i>0){
            int d=i%10;
            i=i/10;
            if(d==3 || d==4|| d==7)
                return false;
            if(d==2 || d==5|| d==6 || d==9)
                res = true;
        }
        return res;
        } 
    }

