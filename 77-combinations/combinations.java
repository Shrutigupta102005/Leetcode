class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        comb(n,k,1,temp);
        return ans;
    }
    List<List<Integer>> ans = new ArrayList<>();
    public void comb(int n , int k , int start , List<Integer> temp ){
        if(k == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i =start ;i<=n;i++){
        temp.add(i);
        comb(n,k-1,i+1,temp);
        temp.remove(temp.size()-1);
        }
    }
}