class Solution {
    public int reverse(int n) {
        int rev_n = 0;
        while(n != 0){
            int ld = n % 10;
            n = n / 10;

            // Check for overflow before multiplying and adding
            if (rev_n > Integer.MAX_VALUE/10 || rev_n < Integer.MIN_VALUE/10) {
                return 0; // Overflow case
            }
            
            rev_n = (rev_n * 10) + ld;
        }
        return rev_n;   
    }
}
