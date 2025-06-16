class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int with=r-l;
            int heigth;
            if(height[l]<height[r]){
                heigth=height[l];
                l++;
                
                
            }
            else{
                heigth=height[r];
                r--;

            }
            int cost=with*heigth;
            if(cost>max){
                max =cost;
            }
        }
        return max;
        
    }
}