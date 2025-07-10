class Solution {
    public String removeStars(String s) {
        Stack<Character> sc=new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='*'){
                if(!sc.isEmpty()){
                    sc.pop();
                }

            }
            else{
                sc.push(i);
            }
        }
        StringBuilder d=new StringBuilder();
        for(char c:sc){
            d.append(c);
        }
        return d.toString();
        
    }
}