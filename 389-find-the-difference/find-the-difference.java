class Solution {
    public char findTheDifference(String s, String t) {
        char[] f = s.toCharArray();
        char[] n = t.toCharArray();

        int[]freq=  new int[26];
        for(char ch : n){
            freq[ch -'a']++;
        }
        for(char ch : f){
            freq[ch -'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i] == 1){
                return (char) (i+'a');
            }
        }
        return ' ';
    }
}