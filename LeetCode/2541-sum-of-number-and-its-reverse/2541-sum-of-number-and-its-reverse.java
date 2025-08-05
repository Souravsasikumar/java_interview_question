class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
        for(int i=0;i<=num;i++){
            if(i+reverse(i)==num){
                return true;
            }
        }
        return false;
    }
    private int reverse(int num){
        int rev=0;
        while(num>0){
            int temp=num%10;
            rev=rev*10+temp;
            num/=10;

        }
        return rev;

    }
}