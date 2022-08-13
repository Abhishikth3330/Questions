// https://leetcode.com/problems/reshape-the-matrix/

package com.company.leetcode.arrayQues;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // storing the values of mat matrix
        // i.e. m = rows & n = cols
        int rows = mat.length;
        int cols = mat[0].length;

        //if the product of rows and cols of mat matrix and the new matrix are not same then return original matrix
        if ((rows*cols) != (r*c)){
            return mat;
        }

        // creating a new matrix
        int[][] output = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                output[rows][cols] = mat[i][j];
                output_cols++;

                // if the cols value reached then change the row and set the cols to 0
                if (output_cols == c){
                    output_cols = 0;
                    output_rows++;
                }
            }
        }
        return output;
    }
}
