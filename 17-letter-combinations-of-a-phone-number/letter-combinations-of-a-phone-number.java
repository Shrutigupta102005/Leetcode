class Solution {
    static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        letter(digits,"");
        return ans;
    }
    List<String> ans = new ArrayList<>();
    public void letter(String ques,String temp){
        if(ques.length() == 0){
            ans.add(temp);
            return;
        }
        char ch = ques.charAt(0);
        String getstr = map[ch -'0'];
        for(int i =0;i<getstr.length();i++){
        letter(ques.substring(1),temp+getstr.charAt(i));
        }

    }
    

}