/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Problem 2: Multiplication Table
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class DanielChung_Prob2 {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read input
        int[][] multiplicationtimestables = new int[5][5];// The variable multipliationtimestables is storing integer numbers that are capped at 5 for the rows and 5 for the coulms
        for (int row = 0; row < 5; row++) {//This loop will have a block of code for 5 times for the integers 1,2,3,4,5
            for (int col = 0; col < 5; col++) {// This initializes a loop through the column of a two way digital array
                multiplicationtimestables[row][col] = (col + 1) * (row + 1);// This code fills the array with products based upon it's multipliers
            }// This ends the interior for statement
        }// This ends the exterior for statement
        for (int row = 0; row < 5; row++) {// This loop will have a block of code for 5 times for the integers 1,2,3,4,5
            for (int col = 0; col < 5; col++) {// This initializes a loop through the column of a two day digital array
                System.out.print(multiplicationtimestables[col][row] + " ");// The output of the code would be the integer number of the column and the integer of the row being multiplied together
            }// This ends the interior for statement
            System.out.println();// This could would be able to print the product of numbers into an organized details upon the code
        }// This statement closes the for statement
    }//This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created