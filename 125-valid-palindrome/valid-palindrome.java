class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase();
        int l = 0 ;
        int e = s.length()-1;
        while(l<e){
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(e);
            if(!Character.isLetterOrDigit(ch1)) {
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch2)) {
                e--;
                continue;
            }
            if(ch1 != ch2) return false;
            l++;
            e--;
        }
        return true;
    }
}