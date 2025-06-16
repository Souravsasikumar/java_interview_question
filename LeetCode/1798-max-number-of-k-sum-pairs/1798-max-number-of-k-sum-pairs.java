class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        int start = 0;
        int end = nums.length-1;
        Arrays.sort(nums);


        if(nums.length < 2) {
            return 0;
        }
        
        while(start < end) {
            if((nums[start] + nums[end]) == k) {
                count++;
                start++;
                end--;
            } else if((nums[start] + nums[end]) > k) {
                end--;
            } else {
                start++;
            }
        }

        return count;
    }
} 