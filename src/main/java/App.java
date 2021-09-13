/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;
import java.lang.Math;


public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Enter the length of the room ");
        int length = s.nextInt();
        System.out.println("Enter the width of the room ");
        int width = s.nextInt();

        int squareFeet = length * width;
        final int perGallonSquareFeetCoverage = 350;
        final double gallonsNeeded = Math.floor(squareFeet / perGallonSquareFeetCoverage) + 1;
        System.out.println(String.format("You will need to purchase %.0f gallons of paint to cover %d square feet.", gallonsNeeded, squareFeet));


    }
}
