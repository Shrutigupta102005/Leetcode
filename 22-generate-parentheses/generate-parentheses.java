class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> a = new ArrayList<>();
        parent(n,0,0,"",a);
        return a;
    }
    public static void parent(int n ,int open ,int close, String ans, List<String> a){
        if(n == open && n == close){
            a.add(ans);
            return;
        }
        if(n >open){
        parent(n,open+1,close,ans+"(",a);
        }
        if(open>close){
        parent(n,open,close+1,ans+")",a);
        }
    }
}