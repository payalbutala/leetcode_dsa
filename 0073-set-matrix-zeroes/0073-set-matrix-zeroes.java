class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowNums = new HashSet<>();
        HashSet<Integer> colNums = new HashSet<>();
        int m = matrix.length; // 2
        int n = matrix[0].length; // 3

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    rowNums.add(i); // 0
                    colNums.add(j); // 0, 3
                }
            }
        }

        // set row values to 0
        for(Integer i : rowNums){
            for(int j=0; j<n; j++){
                matrix[i][j] = 0;
            }
        }

        // set column values to 0
        for(Integer i : colNums){
            for(int j=0; j<m; j++){
                matrix[j][i] = 0;
            }
        }
    }
}