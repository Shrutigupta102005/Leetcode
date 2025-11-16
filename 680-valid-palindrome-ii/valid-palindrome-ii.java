class Solution {
    public boolean validPalindrome(String s) {
        int start = 0; 
        int end  = s.length()-1;
        int count=0;
        while(start<end){
            char ch1 =  s.charAt(start);
            char ch2 =  s.charAt(end);
            if( ch1 == ch2){
                start++;
                end--;
            }
            if(ch1 != ch2){
                return pali(s,start+1,end) || pali(s,start,end-1);
            }
        }
        return true;
    }

    public boolean pali(String s ,int start ,int end){

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}