class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int res = 0, count = 0;
        
        // Find the maximum value in the array
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        
        // Find the length of the longest subarray with maximum AND value
        for (int num : nums) {
            if (num == max) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 0; // reset count if the current number is not the max
            }
        }
        
        return res;
    }
}