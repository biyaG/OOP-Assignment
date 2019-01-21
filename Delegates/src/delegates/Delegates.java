/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegates;

/**
 *
 * @author Biya
 */
public class Delegates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         calculator  calc= new calculator(); 
        calc.Add(); 
    }
    
}
class Calculate { 
    // base class implements method 
    public int Add() 
    { 
        int x = 9;
        int y = 10;
        int z = x + y;
        System.out.println("Adding " + x + " and " + y + " = " + z); 
        return z;
    } 
} // Printer Inheriting functionality of real printer 
    class calculator extends Calculate { 
  
    public int  print() 
    { 
        super.Add(); // inside calling method of parent 
        return 0;
    } 
} 
  

  
