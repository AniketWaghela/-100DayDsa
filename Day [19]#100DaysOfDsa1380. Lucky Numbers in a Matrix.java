class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] col = new int[matrix[0].length];
        int[] row = new int[matrix.length];
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            row[i] = Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){   
                if(row[i]>matrix[i][j]){
                    row[i]=matrix[i][j];
                } 
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            col[j] = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (col[j] < matrix[i][j]) {
                    col[j] = matrix[i][j];
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0; j< matrix[i].length;j++){  
                if(row[i] == matrix[i][j] && col[j] == matrix[i][j] ) list.add(row[i]);
            }
        }

        return list;
    }
}