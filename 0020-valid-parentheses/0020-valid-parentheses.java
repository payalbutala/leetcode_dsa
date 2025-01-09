class Solution {
    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();
        int N = s.length();

        for(int i=0; i<N; i++) {
            String str = s.charAt(i) + "";

            if(str.equals("(") || str.equals("{") || str.equals("[")) {
                st.push(str);
            } else if(str.equals(")")){
                if(st.size() == 0 || !st.peek().equals("(")){
                    return false;
                } else {
                    st.pop();
                }
            } else if(str.equals("}")){
                if(st.size() == 0 || !st.peek().equals("{")){
                    return false;
                } else {
                    st.pop();
                }
            } else if(str.equals("]")){
                if(st.size() == 0 || !st.peek().equals("[")){
                    return false;
                } else {
                    st.pop();
                }
            }
        }

        return st.size() == 0 ? true : false;
    }
}