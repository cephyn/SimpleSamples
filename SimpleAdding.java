/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleAdding;

import java.util.Scanner;

/**
 *
 * @author KJDudley
 */
public class SimpleAdding {
    
    int Adding(String num) {

        //check if we have a valid integer
        int input;
        int output=0;
        try{
            input = Integer.parseInt(num);
            for(int i=input; i>0; i--){
                output=output+i;
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
        SimpleAdding c = new SimpleAdding();
        System.out.print(c.Adding(s.nextLine())); 
    }   
}
