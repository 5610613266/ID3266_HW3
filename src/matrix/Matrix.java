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
import java.util.Scanner;

public class Matrix {
    
    public int SIZE;
    int[][] Matrix;
    
    public Matrix(){
        SIZE = 2;
        Matrix = new int[SIZE][SIZE];
    }
    
    public void setMatrix(int i , int j , int Number){
        Matrix[i][j] = Number;                
    }
    
    public void inputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Matrix");
        for (int i = 0 ; i < SIZE ; i++) {
            for (int j = 0 ; j < SIZE ; j++) {
                Matrix[i][j] = scan.nextInt();
            }
        }
    }
    
    public static Matrix add(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0 ; i < a.SIZE ; i++) {
            for (int j = 0 ; j < a.SIZE; j++) {
                c.Matrix[i][j] = a.Matrix[i][j] + b.Matrix[i][j];
            }
        }
        return c;
    }
    
    public static Matrix substract(Matrix a, Matrix b) {
        Matrix d = new Matrix();
        for (int i = 0 ; i < a.SIZE ; i++) {
            for (int j = 0 ; j < a.SIZE; j++) {
                d.Matrix[i][j] = a.Matrix[i][j] + b.Matrix[i][j];
            }
        }
        return d;
    }
    
    public static Matrix multiply(Matrix a, Matrix b) {
        Matrix e = new Matrix();
        for (int i = 0 ; i < a.SIZE ; i++) {
            for (int j = 0 ; j < a.SIZE ; j++) {
                for (int k = 0 ; k < a.SIZE ; k++) {
                    e.Matrix[i][j] += a.Matrix[i][k] * b.Matrix[k][j];
                }
            }
        }
        return e;
    }
    
    @Override
    public String toString() {
        for (int i = 0 ; i < SIZE ; i++) {
            for (int j = 0 ; j < SIZE ; j++) {
                System.out.print(Matrix[i][j]);
            }
            System.out.println();
        }
        return null;
    }
    
    
    
    
}
