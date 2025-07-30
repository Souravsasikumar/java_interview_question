class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arry=new int[n];
        int pre=1;
        int post=1;
        for(int i=0;i<n;i++){
          arry[i]=1;
        }
        for(int i=0;i<n;i++){
            arry[i]*=pre;
            pre*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            arry[i]*=post;
            post*=nums[i];
        }
        return arry;
    }
}