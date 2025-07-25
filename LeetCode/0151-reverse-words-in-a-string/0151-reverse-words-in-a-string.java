class Solution {
    public String reverseWords(String s) {
        String[] ch=s.trim().split("\\s+");
        String Final="";
        for(int i=ch.length-1;i>0;i--){
            Final+=ch[i]+" ";

        }
        return Final+ch[0];
        
    }
}