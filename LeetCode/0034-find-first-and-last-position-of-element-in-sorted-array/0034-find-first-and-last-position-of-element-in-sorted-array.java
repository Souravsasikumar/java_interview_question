class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] n={-1,-1};
        int a=binarysearch(nums,target);
        int b=binarysearch(nums,target+1)-1;
        if(a<nums.length && nums[a]==target){
            return new int[]{a,b};
        }
        return n;

        
    }
    public int binarysearch(int[] num,int tar){
        int left=0;
        int right=num.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(num[mid]>=tar){
                right=mid;
            }
            else{
                left=mid+1;
            }
            
        }
        return left;
    }
}