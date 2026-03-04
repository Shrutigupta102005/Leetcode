class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> temp = new ArrayList<>();
        comb(k,n,0,1,temp);
        return ans;
    }
    List<List<Integer>> ans = new ArrayList<>();
    public void comb(int k , int n,int currsum,int start ,List<Integer> temp){
        if(n == currsum  && temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(currsum > n){
            return;
        }
        for(int i = start;i<=9;i++){
            temp.add(i);
            comb(k,n,currsum+i,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}