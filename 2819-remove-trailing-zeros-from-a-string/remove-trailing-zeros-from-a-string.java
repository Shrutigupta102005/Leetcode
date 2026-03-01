class Solution {
    public String removeTrailingZeros(String num) {
        int valididx = num.length() ;
        for(int i  = num.length()-1 ;i>=0;i--){
            if(num.charAt(i) == '0'){
                valididx--;
            }else{
                break;
            }
        }
        return num.substring(0,valididx);
    }
}