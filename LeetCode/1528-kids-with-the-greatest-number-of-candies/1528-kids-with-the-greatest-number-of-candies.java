class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //boolean[] arrays=new int[candies.length];
        List<Boolean> sc=new ArrayList<>();
        int great=0;
        for(int i=0 ;i<candies.length;i++){
            great=Math.max(great,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=great){
                sc.add(true);
            }
            else{
                sc.add(false);
            }
        }
        return sc;
        
    }
}