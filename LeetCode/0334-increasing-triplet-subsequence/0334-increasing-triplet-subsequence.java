class Solution {
    public boolean increasingTriplet(int[] nums) {
        int valu1=Integer.MAX_VALUE;
        int valu2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=valu1){
                valu1=nums[i];
            }
            else if(nums[i]<=valu2){
                valu2=nums[i];
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}