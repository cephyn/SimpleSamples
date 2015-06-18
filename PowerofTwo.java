/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PowersofTwo;

import java.util.Scanner;

/**
 *
 * @author KJDudley
 */
public class PowerofTwo {
  String PowersofTwo(String num) { 
  
     //find out if a number is a power of two - returns TRUE if so, FALSE otherwise
    //check if we have a valid integer
        int input;
        String output= null; 
        try{
            input = Integer.parseInt(num);
            //a given number will be the power of 2 if it has an integer square root.
            double result = Math.sqrt(input);
            //if a number mod 1 is 0, then it is an even integer
            if(result % 1 == 0){
                output = "TRUE";
            }
            else{
                output = "FALSE";
            }
            
        }
        catch(NumberFormatException | NullPointerException e){
            System.out.println(num + " is not a valid integer because: " + e.toString());
        }
        
        return output;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    PowerofTwo c = new PowerofTwo();
    System.out.print(c.PowersofTwo(s.nextLine())); 
  } 
    
}
