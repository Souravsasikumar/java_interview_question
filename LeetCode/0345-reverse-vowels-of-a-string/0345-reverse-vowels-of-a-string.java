class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        char[] arr=s.toCharArray();
        String a="aAeEIiOoUu";
        while(l<r){
            while(l<r&&a.indexOf(arr[l])==-1){
                l++;
            }
            while(l<r&&a.indexOf(arr[r])==-1){
                r--;
            }
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}