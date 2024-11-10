class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        
        // If target is greater than or equal to the last letter,
        // or if no greater letter is found, return the first letter
        if (target >= letters[e]) {
            return letters[0];
        }
        
        while (s <= e) {
            int m = s + (e - s) / 2;
            
            if (letters[m] <= target) {  // Changed condition here
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        
        // s will point to the smallest letter greater than target
        return letters[s];
    }
}