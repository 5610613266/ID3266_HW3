/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrix;

/**
 *
 * @author ACER
 */
public class Transpose extends Matrix {
    
    private int SIZE;
    private int[][] Matrix;

    public Matrix Transpose(){
        SIZE = 2;
        Matrix = new int[SIZE][SIZE];
        Matrix c = new Matrix();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                c.Matrix[i][j] = Matrix[j][i];
            }
        }
        return c;
    } 
     

}
