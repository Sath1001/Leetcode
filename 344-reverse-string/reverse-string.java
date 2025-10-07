class Solution {
    public void reverseString(char[] s) {
        char temp;
        int n = s.length;
        int l=0;
        int r=n-1;
        while(l<r)
        {
            temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
    }
}