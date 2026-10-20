/*
Name: Daniel Chung
        ID: 1331774
        Course: CSCI 125 Programming 1
        Section: M01
        Problem 2: Chessboard Pattern
        */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class Main {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is a string used that is utilized to start arguments
        Scanner scanner = new Scanner(System.in);// This is a scanner that would allow objects in the code to be scanned

        final int chessboardsize = 8;// constant integer variable with a value of 8, and its value cannot be changed after it is assigned.

        int d = 0;// The integer d is alued at zero
        while (d < chessboardsize) {// a while statement that is indicating that the variable d is less than the variable chessboardsize
            int s = 0;// integer s is valued at 0
            while (s < chessboardsize) {// a while statement that indicates that s is less than the variable chessboardssize
                if ((d + s) % 2 == 0) {// This code checks to make sure if the sum of d and s is an even number, it is also the start of an if statement
                    System.out.print("# ");  // This is telling the code to produce an output of '#'
                } else {// This is the start of an else statement
                    System.out.print("- ");  //Telling the code to produce an output of '-'
                }// Closing curly bracket for the else statement
                s++;  // This increments the value of the s variable by 1
            }
            System.out.println();  // This line of code allows the whole output to be produced
            d++;  // This increments the value of the d variable by 1
        }
        scanner.close();// This closes the scanner for the entire operating system.
    }//This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created