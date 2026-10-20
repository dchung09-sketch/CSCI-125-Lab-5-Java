/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Problem 1: Only Lowercase Alphabet Characters
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class Main {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.println("Hi! Please enter any pair of words or sentences to observe the output of the code to only show all of the lowercase letters! Word Choices:");// The output of this code would be provided in the green text prompted
        String alphabeticalworldprov = scanner.nextLine();// There is a string that currently holds a value at the variable 'alphabeticalworldprov'
        char[] userchosenalpahbets = alphabeticalworldprov.toCharArray();// The code initialized the variable alphabeticalworldprov to investigate and use its individual characters
        String outputoflowercaseletters = "";// This line of code initialized the variable 'outputoflowercaseletters' to an empty string
        boolean nooutput = false;// The boolean statement is indicating that the variable 'nooutput' is being labeled at false
        for (char beginningletters : userchosenalpahbets) {// Within the array, the variable userchosenalphabets are characterizing the letters and storing them into variable 'beginningletters'
            if (beginningletters >= 'a' && beginningletters <= 'z') {// This if statement is indicating whether the variables of 'beginningletters' are greater than or equal to 'a' or less than or equal to 'z'
                outputoflowercaseletters += beginningletters;// This code is building the output of the variable "outputoflowercaseletters" one character at a time
                nooutput = true;// If that is the scenario, the variable nooutput is true
            }// This ends the if statement
        }// This ends the 'for' statement
        if (nooutput) {// The statement is questioning the variable 'nooutput'
            System.out.println("The output which would only print out all of the lowercase values within the statement that you provided are: " + outputoflowercaseletters + " ! ");// The output is provided in green text with the lowercase letters in the output
        } else {// This is an else statement
            System.out.println("The Words/ Sentences that you have provided are all in UPPER LETTER CAPS so there is no output of lowercase values.");// The output is printed in green text if the if/ else statements apply
        }// This ends the last else statement
    }//This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created
