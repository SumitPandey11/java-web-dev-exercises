package org.launchcode.java.studio.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String [] args){

        System.out.println("CountingCharacters");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a string : ");
        String myString = myObj.nextLine();  // Read user input
        myString = myString.toLowerCase(); // This will make the character counts case-insensitive
        myString = myString.replaceAll("[^a-zA-Z]", ""); //Exclude non-alphabetic characters
        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> countChar = new HashMap<Character, Integer>();

        for(char c: charactersInString){

            if(countChar.containsKey(c)){
                int i = countChar.get(c) ;
                countChar.replace(c,++i);
            }else {
                countChar.put(c,1);
            }
        }

        for(char c : countChar.keySet()){
            System.out.println(c + " : " + countChar.get(c));
        }




    }
}
