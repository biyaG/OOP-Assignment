/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;
import java.util.*; 
import java.util.Set;

/**
 *
 * @author Biya
 */
public class Properties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Properties person = new Properties(); 
        Set Name;
        String age;
          
        person.put("Abebe", "20"); 
        person.put("Kebede", "30"); 
        person.put("Helen", "25"); 
          
        person.list(System.out); 
       
        

    }

   
}
