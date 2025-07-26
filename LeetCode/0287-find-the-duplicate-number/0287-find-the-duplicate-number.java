class Solution {
    public int findDuplicate(int[] nums) {
        int[] num=new int[nums.length+1];
        for(int n:nums){
            num[n]++;
        }
        for(int i=0;i<num.length;i++){
            if(num[i]>1){
                return i;
            }
        }
        return 0;
        
    }
}