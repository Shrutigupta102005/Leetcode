class Solution {
    public int[] diStringMatch(String s) {
        int[] arr = new int[s.length() +1];
        int count = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ;i<=s.length();i++){
            if(i == s.length() || s.charAt(i) == 'I'){
                
                arr[i] = count;
                count++;
                while(!st.isEmpty()){

                    arr[st.pop()]=count;
                    count++;
                }
                }else{
                    st.push(i);
            }
        }
        return arr;
    }
}