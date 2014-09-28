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
public class ComplexMatrix extends Matrix {

    
    private ComplexNumber Matrix[][];
        
    public ComplexMatrix(){
        Matrix = new ComplexNumber[super.SIZE][super.SIZE];
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                Matrix[i][j] = new ComplexNumber();
            }
        }
    }
    
    public ComplexMatrix(int intSIZE) {
        Matrix = new ComplexNumber[super.SIZE][super.SIZE];
        for (int i = 0 ; i < SIZE ; i++) {
            for (int j = 0 ; j < SIZE ; j++) {
                Matrix[i][j] = new ComplexNumber();
            }
        }
    }

    public static ComplexMatrix add(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix c = new ComplexMatrix();
        for (int i = 0 ; i < a.SIZE ; i++) {
            for (int j = 0 ; j < a.SIZE ; j++) {
                c.Matrix[i][j] = ComplexNumber.add(a.Matrix[i][j], b.Matrix[i][j]);
            }
        }
        return c;
    }
    
    public static ComplexMatrix substract(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix d = new ComplexMatrix();
        for (int i = 0 ; i < a.SIZE ; i++) {
            for (int j = 0 ; j < a.SIZE ; j++) {
                d.Matrix[i][j] = ComplexNumber.substract(a.Matrix[i][j], b.Matrix[i][j]);
            }
        }
        return d;
    }
    
    public static ComplexMatrix multiply(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix e = new ComplexMatrix();
        for (int i = 0 ; i < a.SIZE ; i++) {
            for (int j = 0 ; j < a.SIZE ; j++) {
                for (int k = 0 ; k < a.SIZE ; k++){
                    e.Matrix[i][j] = ComplexNumber.add(e.Matrix[i][j], ComplexNumber.multiply(a.Matrix[i][k], b.Matrix[k][j]));
                }                
            }
        }
        return e;
    }
    
    

    
}
