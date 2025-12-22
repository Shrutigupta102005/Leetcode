class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public static void transpose(int[][] matrix){
        for(int i= 0 ;i<matrix.length;i++){
            for(int j= i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                 matrix[i][j] =  matrix[j][i];
                 matrix[j][i] =  temp;
            }
        }
    }

    public static void reverse(int[][] matrix){
        for(int i= 0;i<matrix.length;i++){
            int l = 0 ;
            int r = matrix.length-1;
            while(l<r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
    }
    }
