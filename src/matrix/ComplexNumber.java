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
public class ComplexNumber {
    
    private int x;
    private int y;
    
    public ComplexNumber(){
        x = 0;
        y = 0;
    }
    
    public ComplexNumber(int xr , int yi){
        x = xr;
        y = yi;
    }
    
    public int getRealPart(){
        return x;
    }
    
    public int getImaginaryPart(){
        return y;
    }
    
    public ComplexNumber add(ComplexNumber p){
        int real = x + p.getRealPart();
        int imag = y + p.getImaginaryPart();
        return new ComplexNumber(real,imag);
    }
    
    public ComplexNumber add(int p){
        int real = x + p;
        int imag = y + 0;
        return new ComplexNumber(real,imag);
    }
    
    public ComplexNumber substract(ComplexNumber p){
        int real = x - p.getRealPart();
        int imag = y - p.getImaginaryPart();
        return new ComplexNumber(real,imag);
    }
    
    public ComplexNumber substract(int p){
        int real = x - p;
        int imag = y - 0;
        return new ComplexNumber(real,imag);
    }
    
    public ComplexNumber Multiplication(ComplexNumber p){
        int real = (x * p.getRealPart()) - (y * p.getImaginaryPart());
        int imag = (x * p.getImaginaryPart()) + (y * p.getRealPart());
        return new ComplexNumber(real,imag);
    }
    
    public ComplexNumber Multiplication(int p){
        int real = p * x;
        int imag = p * y;
        return new ComplexNumber(real,imag);
    }
    
    public double Magnitude(ComplexNumber p){
        double q = Math.sqrt((p.getRealPart() * p.getRealPart()) + (p.getImaginaryPart() * p.getImaginaryPart()));
        return q;
    }
    
    
    @Override
    public String toString(){
        return "(" + x + "+" + y + "i)";
    }
    
    public boolean Compare(ComplexNumber p){
       return Math.sqrt((x * x)+(y * y)) == Math.sqrt((p.x * p.x)+(p.y * p.y)); 
    }
}
