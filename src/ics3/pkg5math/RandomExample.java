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

public class RandomExample{
    public static void main(String [] args){
        
// Generate double or int random numbers
        double random0to1 = Math.random();
        System.out.println("Here is a random number from 0(inclusive) to 1(exclusive): " + random0to1);
        double random1to10 = (int)(10*random0to1 + 1); 
        System.out.println("We can convert it to a random integer between 1 and 10: " + random1to10);
        
        System.out.println("\nTo generate random integer number we can use the following template:");
        System.out.println("randomNum = (int)(numberOfValues * Math.random() + firstValue);");
        System.out.println("For example:");
        System.out.println("             randomNum = (int)(28 * Math.random() + 1);");
        System.out.print("will produce random number from 1 to 28, inclusive: ");
        double randomNum = (int)(28 * Math.random() + 1);
        System.out.println(randomNum);
        
    }
}

