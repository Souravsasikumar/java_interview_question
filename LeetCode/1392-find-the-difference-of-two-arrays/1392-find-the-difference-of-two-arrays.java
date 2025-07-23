class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>a1=new ArrayList<>();
        List<Integer>a2=new ArrayList<>();
        Set<Integer>h1=new HashSet<>();
        Set<Integer>h2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            h1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            h2.add(nums2[i]);
        }
        for(int num:h1){
            if(!h2.contains(num)){
                a1.add(num);
            }
        }
        for(int num:h2){
            if(!h1.contains(num)){
                a2.add(num);
            }
        }
        result.add(a1);
        result.add(a2);
        return result;

        
    }
}