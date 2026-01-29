class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f = strs[0] ;
        String l  = strs[strs.length-1];
        int idx =  0 ;
        while(idx< f.length()){
            if(f.charAt(idx) == l.charAt(idx)){
                idx++;
            }else{
                break;
            }
        }
        if(idx == 0){
            return "";
        }else{
            return f.substring(0,idx);
        }

    }
}