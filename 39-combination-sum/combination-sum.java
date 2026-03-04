class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        comb(candidates,target,0,0,temp);
        return ans;
    }
    List<List<Integer>> ans = new ArrayList<>();
    public void comb(int[] arr , int target , int start ,int currSum,List<Integer> temp){
        if(currSum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(currSum > target){
            return;
        }
        for(int i = start;i<arr.length;i++){
            temp.add(arr[i]);
            comb(arr,target,i,currSum+arr[i],temp);
            temp.remove(temp.size()-1);
        }
    }
}