class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int j=0;
        for(int i=0;i<n;i++){
            char a=chars[i];
            int count=0;
            while(i<n&&chars[i]==a){
                count++;
                i++;

            }
            if(count==1){
                chars[j++]=a;

            }
            else{
                chars[j++]=a;
                for(char digit:Integer.toString(count).toCharArray()){
                    chars[j++]=digit;
                }
            }
            i--;
        }
        return j;
        
    }
}