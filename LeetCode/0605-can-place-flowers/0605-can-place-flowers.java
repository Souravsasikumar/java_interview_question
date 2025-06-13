class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        int j=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0&&(i==0 ||flowerbed[i-1]==0)&&(i==flowerbed.length-1||flowerbed[i+1]==0)){
                j++;
                flowerbed[i]=1;
                if(n==j){
                    return true;
                }


            }
            
                
            
        }
        return false;
        
    }
}