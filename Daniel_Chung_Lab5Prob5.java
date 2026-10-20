/*
Name: Daniel Chung
        ID: 1331774
        Course: CSCI 125 Programming 1
        Section: M01
        Problem 5: Simple Palindrome Checker
        */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class Daniel_Chung_Lab5Prob5 {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.print("Enter any word of your choice to declare if it is a palindrome! : ");// The output of this code would be the green text
        String userinputedword = scanner.nextLine();// This is a string that is identifying the variable userinputedword

        String letteratlow = userinputedword.toLowerCase();//converts the string userinputedword to all lowercase letters and stores the result in the variable letteratlow.
        String crosseddialect = "";// initializes a string variable crosseddialect with an empty string as its value.
        for (int i = letteratlow.length() - 1; i >= 0; i--) {// Starts and decreases i by 1 with each iteration, continuing until i reaches 0, effectively iterating through the string in reverse order.
            crosseddialect += letteratlow.charAt(i);//Building a reversed version of letteratlow if used inside a loop that iterates backwards.
        }// The end for the 'for' statement
        if (letteratlow.equals(crosseddialect)) {// Checking to see f the strings are equal towards each other, if they are the 'if' statement is conducted
            System.out.println("The word that you have inputed towards the user " + userinputedword + " is declared as a palindrome!");// The output would be the code that is printed in green
        } else {// this is the beginning of an if statement
            System.out.println("The word you have inserted towards the user " + userinputedword + " is not a palindrome.");// The output would be the code that is printed in green
        }// This is the end of the else statement

        scanner.close();// This code would close the overall scanner
    }//This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created