class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            sum-=nums[j];
            if(sum==leftsum){
                return j;
            }
            leftsum+=nums[j];
        }
        return -1;
        
    }
}