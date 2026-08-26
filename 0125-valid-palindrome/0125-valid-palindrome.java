class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i=0;
        int j=s1.length()-1;
        Boolean flag = true;
        while(i<j){
            if(s1.charAt(i)==s1.charAt(j)){
                i++;
                j--;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag) return true;
        else return false;
    }
}