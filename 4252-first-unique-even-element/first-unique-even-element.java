class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0) + 1);
        }

        for(int n : nums){
            if( n % 2== 0 && map.get(n) == 1){
                return n;
            }
        }
        return -1;
    }
}