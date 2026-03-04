class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        comb(candidates,target,0,0,temp);
        return ans; 
    }
    List<List<Integer>> ans = new ArrayList<>();
    public void comb(int[]arr,int target,int start, int currsum,List<Integer> temp){
        if(currsum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(currsum >target){
            return;
        }
        for(int i = start;i<arr.length;i++){
            if(i>start && arr[i] == arr[i-1]) continue;
            else{
            temp.add(arr[i]);
            comb(arr,target,i+1,currsum + arr[i],temp);
            temp.remove(temp.size()-1);
            }
        }
    }
}