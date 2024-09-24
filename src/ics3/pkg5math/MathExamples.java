/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics3.pkg5math;
/** 
 * Demonstrates advanced math operations using Math class
 * @author ICS3U
 * @version Sept 2017
 */ 

public class MathExamples{
    public static void main(String [] args){
 
        int number = 65;
        
// Assign method's result to a variable    
        double sqRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + sqRoot);
        int power = (int)Math.round(sqRoot);
        System.out.println("Rounded this number is " + power);
        double exponent1 = Math.pow(2, power);
        System.out.println("Two to the power of " + power + " is " + exponent1);
        double exponent2 = Math.pow(Math.E, power);
        System.out.println("Euler's number e to the power of " + power + " is " + exponent2);
        
// Print method's result
        System.out.println("The larger of the two exponents is " + Math.max(exponent1,exponent2));
        
// Use method's result in an expression
        double rounded = Math.round(exponent2 * 100)/100.0;
        System.out.println("Rounded to two digits after the decimal point it is " + rounded);
        
    }
}

