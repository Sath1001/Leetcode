class Solution {
    public int addDigits(int num) {
        while(num>9)
        {
            int m=num,res=0;
            while(m>0){
                int d=m%10;
                m=m/10;
                res= res+d;

            }
            num=res;
        
        }
        return num;

    }
}