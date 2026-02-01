class Solution {
    public String largestNumber(int[] nums) {
        // Convert integers to strings
        String[] store = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            store[i] = String.valueOf(nums[i]);
        }

        // Custom sort with comparator
        Arrays.sort(store, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1); // descending order
        });

        // 🔹 handle all zeros case
        if (store[0].equals("0")) return "0";

        // Concatenate all strings
        StringBuilder ans = new StringBuilder();
        for (String s : store) {
            ans.append(s);
        }

        return ans.toString();
    }
}