class Solution {
    public int maxVowels(String s, int k) {
        int right=0,left=0;
        int n=s.length();
        int maxcount=0,count=0;
        while(right<n){
            if(isVowel(s.charAt(right))) count++;
            if(right-left+1==k){
                maxcount=Math.max(maxcount,count);
                if(isVowel(s.charAt(left++))) count--;
            }
            right++;
        }
        return maxcount;
        
    
        
    }
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}