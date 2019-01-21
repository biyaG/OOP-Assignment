/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

import java.util.Scanner;

/**
 *
 * @author Biya
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 integer");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        System.out.println("sum of 2 integers: " + add(num1, num2));
        
        System.out.println("Enter 2 double");
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        
        System.out.println("sum of 2 double: " + sub(num3, num4));
       
    }
    
    public static int sub(int num1, int num2){
        return num1 - num2;
    }
    
    public static double sub(double num1, double num2){
        return num1 - num2;
    }
    
   
}
