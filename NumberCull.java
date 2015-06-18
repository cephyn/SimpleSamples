/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp208;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author KJDudley
 */
public class NumberCull {
    
    //take an input series of numbers, cull out duplicates
    //return culled list of numbers in order.
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> refList = new ArrayList<>();

        System.out.print("Enter Numbers: ");
        String input = scan.nextLine();

        String[] numbersAsStrings = input.split(" ");

        for(int i = 0; i < numbersAsStrings.length; i++){
            Integer test = Integer.parseInt(numbersAsStrings[i]);
            if(!refList.contains(test)){
                refList.add(test);
            }
        }
        Collections.sort(refList);
        System.out.print(refList.toString());
    }
}
