class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int curmax=0,curmin=0;
        int max=nums[0],min=nums[0];
        int total=0;
        for(int i=0;i<n;i++){
            curmax=Math.max(curmax+nums[i],nums[i]);
            max=Math.max(max,curmax);
            curmin=Math.min(curmin+nums[i],nums[i]);
            min=Math.min(min,curmin);
            total+=nums[i];

        }
        
        if(min==total){
            return max;
        }
        return(Math.max(max,total-min));
        
    }
}