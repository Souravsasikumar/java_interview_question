class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double cur=0;
        for(int i=0;i<k;i++){
            cur+=nums[i];

        }
        double max=cur;
        for(int i=k;i<nums.length;i++){
            cur=cur-nums[i-k]+nums[i];
            max=Math.max(max,cur);
        }
        return max/k;
    }
}