package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a radius : ");
        String radius = myObj.nextLine();  // Read user input
        boolean invalidEntry = true;
        while(invalidEntry){

            if(radius.trim() == "" || !radius.matches("[0-9]+") ){
                System.out.println(" Invalid entry");
                invalidEntry = true;
                //radius = myObj.nextLine();
                System.out.println("Enter a radius : ");
                radius = myObj.nextLine();
            }else{
                invalidEntry = false;
            }
        }


            double r = new Double(radius);
            System.out.println("The area of a circle of radius " + radius + " is : " + Circle.getArea(r));

    }
}
