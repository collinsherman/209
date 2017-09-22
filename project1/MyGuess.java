/*
 * Author: Collin Sherman
 * File: MyGuess.java
 * Project: 1
 * Try to guess a random number within a certain amount of tries.
 */

import java.util.Scanner;

public class MyGuess{
    
    public static void main(String[] args){
        System.out.print("\nWelcome to Guess That Number, where you will try to guess my number!\n");
        System.out.print("What would you like the highest possible number to be? ");
        Scanner input = new Scanner(System.in);
        int high = input.nextInt();
        double myNumber = Math.round(Math.random() * high + 1);
        int count = 0;
        double maxGuess = Math.log(high) / Math.log(2);
        System.out.format("\nI'm thinking of a number between 1 and %s. You will have %s guesses.\n\n", high, Math.round(maxGuess));
        
        while(true){
            count += 1;
            input = new Scanner(System.in);
            System.out.format("Guess #%s\n", count);
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
    
            if(guess == myNumber){
                String result = String.format("You guessed it in %s attempts!\n", count);
                System.out.print(result);
                break;
            }

            else if(guess < myNumber)
                System.out.print("Too small!\n\n");

            else 
                System.out.print("Too large!\n\n");

            if(count == Math.round(maxGuess)){
                System.out.format("Exceeded maximum allowable guesses! The number was %s.\n", (int)myNumber);
                break;
            }
        }
    }
}
   