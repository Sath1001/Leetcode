class Solution {
    public boolean isHappy(int n) {
        while(n!=4){
            if(n==1)
                return true;
            n=sum_of_digits(n);
        }
        return false;
    }
    public int sum_of_digits(int n){
        int res= 0;
        while(n!=0){
            int d=n%10;
            n=n/10;
            res=res+d*d;

        }
    return res;

    }
    }
