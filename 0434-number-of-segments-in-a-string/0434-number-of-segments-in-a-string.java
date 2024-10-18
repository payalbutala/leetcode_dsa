class Solution {
    public int countSegments(String s) {
        int N = s.length();
        int count  = 0;

        for(int i=0; i<N; i++){
            String current = ""+s.charAt(i);

            if(!current.equals(" ")) {
                count++;

                while(i < N-1 && (!current.equals(" "))){
                    i++;
                    current = ""+s.charAt(i);
                }
            }
        }

        return count;
    }
}