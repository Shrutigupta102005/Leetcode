class Solution {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int ws = 0;
        for(int i = 0;i<k;i++){
            if(isVowel(arr[i])){
                ws++;
            }
        }        
        int maxans = ws;
        if(maxans == k) return maxans;

        for(int i = k;i<arr.length;i++){
            if(isVowel(arr[i])){
                ws++;
                }
             if(isVowel(arr[i-k])){
                ws--;
                }
                maxans = Math.max(ws,maxans);
        }
        return maxans;
    }
    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ) return true;
        return false;
    }
}