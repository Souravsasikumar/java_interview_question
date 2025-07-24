class Solution {
    public int findGCD(int[] nums) {
        int a=0;
        int b=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
             a=Math.max(a,nums[i]);
             b=Math.min(b,nums[i]);

        }
        int result=Math.min(a, b);
        while(result>0){
            if(a%result==0&&b%result==0){
                break;
            }
            result--;
        }
        return result;
        
    }
}