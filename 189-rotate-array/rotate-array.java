class Solution {
    public void rotate(int[] nums, int k) {
    int n=nums.length;
    k=k%n;
    Reverse(nums,0,n-k-1);
    Reverse(nums,n-k,n-1); 
    Reverse(nums,0,n-1);   
    }

public void Reverse(int[] a, int st, int end){
    while(st<end){
        //swap
        int temp=a[st];
        a[st]=a[end];
        a[end]=temp;
        st++;
        end--;
    }
}
}