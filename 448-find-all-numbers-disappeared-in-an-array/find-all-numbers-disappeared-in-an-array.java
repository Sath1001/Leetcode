import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1]; // index 0 unused
        
        // Step 1: Mark numbers that are present
        for (int num : nums) {
            present[num] = true;
        }
        
        // Step 2: Add missing numbers to the result list
        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missing.add(i);
            }
        }
        
        return missing;
    }
}
