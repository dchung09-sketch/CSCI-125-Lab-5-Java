/*
Name: Daniel Chung
        ID: 1331774
        Course: CSCI 125 Programming 1
        Section: M01
        Problem 2: Right-Angled Triangle of Stars
        */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class Main {// This class is the starting design for creating various code
    public static void main(String[] args){//This is the starting base for various objects/blueprints
        Scanner input = new Scanner(System.in);//This class is the starting design for creating various code
            System.out.print("What are the amount of rows of stars that you would like in your right-angled triangle?");// The output of the code is printed in green
            int userinitializednumber = input.nextInt();// This is setting the integer that the user inputs is being set towards

            int initialrow = 1;// The variable initial row is being set a value of 1
            while (initialrow <= userinitializednumber) {// This is a while statement indicating that the first variable is less than or equal to the second variable
                int currentnumber = 0;// The variable currentnumber is being set to 0
                while (currentnumber < initialrow) {// Another while statement that sets the current number that the user inserted to be less than the first avriable
                    System.out.print("*");// The output code will be in green
                    currentnumber++;// The variable is being set to an increment as it is being increased by 1 everytime
                }// This bracket ends the operation for the while statement
                System.out.println();// This line of code allows the entire output to be printed out without any problems
                initialrow++;// The variable is being set to an increment as it is being increased by 1 everytime
            }// This puts an end to the veru first while statement within the code

            input.close();// This line of code puts an end towards the entire input scanner
        }//This is the end block of code for the "public static void main(String[] args)" statement
    }//This is the end block of code for the "public class Main" blueprint code that was created
