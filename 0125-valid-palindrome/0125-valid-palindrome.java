class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        } else {
            // Convert the input string to lowercase
            String lc = s.toLowerCase();
            
            // Remove non-alphanumeric characters
            lc = lc.replaceAll("[^a-z0-9]", "");
            
            // Create a StringBuilder to reverse the string
            StringBuilder revStr = new StringBuilder(lc);
            revStr.reverse();
            
            // Compare the original and reversed strings
            return lc.equals(revStr.toString());
        }
    }
}
