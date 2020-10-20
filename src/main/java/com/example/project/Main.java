package com.example.project;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number = 10;
        boolean done = false;

        // Ask the user to guess a number from 0 to 100
        System.out.println("Guess the number between 0 and 100 inclusive");

        // Get the first guess using scan.nextInt();
        int n = scan.nextInt();

        // Loop while the guess does not equal the random number,
        while(!done) {

            // If the guess is less than the random number, print out "Too low!"
            if(n < number){
                System.out.println("Too low");
                n = scan.nextInt();
                }
            // If the guess is greater than the random number, print out "Too high!"
            else if(n>number){
                System.out.println("Too high");
                n = scan.nextInt();
            }
            // Get a new guess (save it into the same variable)
            else if(n == number){
                System.out.println("You got it!");
                done = true;
            }
        }

        // Print out "You got it!"

    }
}