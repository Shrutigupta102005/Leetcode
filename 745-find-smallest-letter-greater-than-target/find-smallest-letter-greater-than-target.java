class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int end = letters.length-1;
        
        if(target>= letters[end]){
            return letters[0];
        }

        while(s<=end){
            int m = s+(end-s)/2;
            if(letters[m]<= target){
                s=m+1;
            }else{
                end=m-1;
            }
        }
        return letters[s];

    }
}