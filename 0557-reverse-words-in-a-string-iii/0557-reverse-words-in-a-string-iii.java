class Solution {
    public String reverseWords(String s) {
        StringBuffer ans = new StringBuffer();
        int N = s.length();

        for (int i = 0; i < N; i++) {
            String ch = "" + s.charAt(i);
            StringBuffer temp = new StringBuffer();

            while (i < N && !ch.equals(" ")) {
                temp.insert(0, ch);
                i++;
                if (i < N) {
                    ch = "" + s.charAt(i);
                }
            }

            ans.append(temp);
            
            if (i < N) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}