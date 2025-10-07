class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        int temp;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != 0)
            {
                temp=nums[i];
                nums[i]=nums[c];
                nums[c]=temp;
                c++;
            }
        }
    }
}