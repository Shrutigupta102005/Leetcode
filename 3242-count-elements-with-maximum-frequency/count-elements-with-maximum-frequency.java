class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }

        }
        int maxfreq = 0 ;
        for( int freq : map.values()){
            if(freq >maxfreq){
                maxfreq = freq;
            }
        }
        int count = 0 ;
        for (int freq : map.values()) {
            if (freq == maxfreq) {
                count += freq;
            }
        }

        return count;
    }
}