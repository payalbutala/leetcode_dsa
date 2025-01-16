class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length; // length of A array
        int m = B.length;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        int[] C = new int[n];

        // iterate both array with 1 forloop.
        // for loop
        // a[0]=1, b[0]=3 equal ? count++; number of elemnts in identical

        for(int i=0; i<n; i++){
            if(A[i] == B[i]){
                count++;
            } else {
                if(set.contains(A[i])){
                    set.remove(A[i]);
                    count++;
                } else {
                    set.add(A[i]);
                }
                
                if(set.contains(B[i])){
                    set.remove(B[i]);
                    count++;
                } else {
                    set.add(B[i]);
                }
            }
            C[i] = count;
        }

        return C;
    }
}
/*
hashset set1 : 1 3 2  
hashset set2 : 3 1 2

A = [1,3,2,4], B = [3,1,2,4]

set : 


 */