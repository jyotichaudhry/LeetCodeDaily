class Solution {
    public String makeGood(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<Character>();
        st.push(s.charAt(0));
        for (int i = 1 ; i < n ;++i){
            if (!st.empty() && Math.abs(st.peek()-s.charAt(i)) == 32){
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
                
        }
        char res[] = new char[st.size()];
        int index = st.size()-1;
        while(!st.isEmpty()){
            res[index--] = st.pop();
        }
        return new String(res);
       
       
    }
}