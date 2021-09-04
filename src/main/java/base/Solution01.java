/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

//Create a program that
//prompts for your name and
// prints a greeting using your name.

package base;

import java.util.Scanner;

public class Solution01 {
    /*
        program start
        print "Enter name" and store into 'name'
        print "Hello there 'name'"
     */

    public static void main(String[] args)
    {
        //prompt user to enter name
        System.out.print("Please enter your name: ");

        //store user input as variable 'name'
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        //display greeting
        System.out.print("\nHello there " + name + "!\n");

    }

}
