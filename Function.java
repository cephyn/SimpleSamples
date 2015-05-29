/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstreverse;

import java.util.Scanner;

/**
 *
 * @author KJDudley
 */
public class Function {
    String FirstReverse(String str) { 
  
        // code goes here   
        /* Note: In Java the return type of a function and the 
           parameter types being passed are defined, so this return 
           call must match the return type of the function.
           You are free to modify the return type. */
        
        //get length of string
        int length = str.length();
    
        char[] strArray = str.toCharArray();
        for(int i=0; i<(length/2); i++){
            
            //pull out last char
            char x = strArray[length-(i+1)];
            //swap with first char
            strArray[length-(i+1)]=strArray[i];
            strArray[i]=x;
            
        }

        str = new String(strArray);
        return str;

    } 

    public static void main (String[] args) {  
        // keep this function call here     
        Scanner  s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.FirstReverse(s.nextLine())); 
    }   
}
