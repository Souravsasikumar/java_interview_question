class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        
        int count_zero=0;
        int n=nums.length;
        int mxlength=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                count_zero++;
            }
            while(count_zero>1){
                if(nums[left]==0){
                    count_zero--;
                }
                left++;
            }
            mxlength=Math.max(mxlength,right-left+1-count_zero);
        }
        return (mxlength==n)?mxlength-1:mxlength;
        
    }
}