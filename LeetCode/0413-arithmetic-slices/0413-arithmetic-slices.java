class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count=0;int max=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                count+=1;
                max+=count;
            }
            else
              count=0;

        }
        return max;
        
    }
}