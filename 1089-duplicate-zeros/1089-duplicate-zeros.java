class Solution {
    public void duplicateZeros(int[] arr) {
        int N = arr.length;
        int i = 0;

        while(i < N-1){
            if(arr[i] == 0){
                int k = N-1;
                while(k > i){
                    arr[k] = arr[k-1];
                    k--;
                }
                arr[i+1] = 0;
                i++;
            }
            i++;
        }
       
    }
}
/*
[1,0,2,3,0,4,5,0]
[1,0, 0,2,3,0,0,4]
 */