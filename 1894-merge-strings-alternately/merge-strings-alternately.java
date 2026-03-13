class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        int i = 0 ;
        int j = 0 ;

        String ans = "";
        while(i< n1 && j<n2){
            ans += word1.charAt(i);
            ans += word2.charAt(j);
            i++;
            j++;
        }
        if(i<n1){
            ans += word1.substring(i);
        }
        if(j<n2){
            ans += word2.substring(j);
        }
        return ans;
    }
}