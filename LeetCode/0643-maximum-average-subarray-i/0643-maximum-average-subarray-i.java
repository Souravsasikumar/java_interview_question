class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double cur = 0;
        for (int i = 0; i < k; i++) {
            cur += nums[i];
        }
        double max = cur;
        for (int i = k; i < nums.length; i++) {
            cur += nums[i] - nums[i - k];  // Move the window
            max = Math.max(max, cur);      // Update max
        }
        return max / k;
    }
}
