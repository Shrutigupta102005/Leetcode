class Solution {
    public int countSegments(String s) {
        String[] arr = s.trim().split("\\s+");
        if (s.trim().isEmpty()) {
            return 0;
        }
        
        return arr.length;
    }
}