class Solution {
    static String[] map ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ll = new ArrayList<>();
        poo(digits,"",ll);
        return ll;
    }

    public static void poo(String ques,String ans,List<String>ll){
        if(ques.length() == 0){
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String getstring = map[ch-'0'] ;
        for(int i = 0;i<getstring.length();i++){
        poo(ques.substring(1),ans+getstring.charAt(i),ll);
        }

    }
}