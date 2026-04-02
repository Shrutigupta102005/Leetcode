class Solution:
    def isValid(self, s: str) -> bool:
        st=[]
        for ch in s:
            if ch == '(' or ch =='{' or ch =='[':
                st.append(ch)
            else:
                if len(st) == 0:
                    return False
                elif ch == ')' and st[-1] =='(' or ch == '}' and st[-1] =='{' or ch == ']' and st[-1] =='[' :
                    st.pop()
                else:
                    return False
        return len(st) == 0 
        
        