class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;
        int count2=0;
        int major1=0;
        int major2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0&& nums[i]!=major2){
                major1=nums[i];
                count1=1;
            }
            else if(count2==0&&nums[i]!=major1){
                major2=nums[i];
                count2=1;

            }
            else if(nums[i]==major1){
                count1++;

            }
            else if(nums[i]==major2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=count2=0;
        for(int num:nums){
            if(num==major1) count1++;
            else if(num==major2) count2++;
        }
        List<Integer> sc=new ArrayList<>();
        if(count1>nums.length/3) sc.add(major1);
        if(count2>nums.length/3) sc.add(major2);
        return sc;
 
    }
}