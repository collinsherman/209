/*
 * Author: Collin Sherman
 * File: YourGuess.java
 * Project: 1
 * The computer will try to guess a random number thought of by the user.
 */

import java.util.Scanner;

public class YourGuess{
    
    public static void main(String[] args){
        System.out.print("\nWelcome to Guess That Number, where I will try to guess your number!\n");
        System.out.print("What would you like the highest possible number to be? ");
        Scanner input = new Scanner(System.in);
        int upperLimit = input.nextInt() + 1;
        int lowerLimit = 0;     
        int count = 0;
        int guess = 0;
        double maxGuess = Math.log(upperLimit) / Math.log(2);
        System.out.format("\nThink of a number between %s and %s. I will have %s guesses.\n\n", lowerLimit + 1, upperLimit - 1, Math.round(maxGuess));
        System.out.print("Do you have your number? Y/N? ");        
        input = new Scanner(System.in);
        String confirm = input.nextLine().toUpperCase();       
        
        if(confirm.contains("Y"))
            System.out.print("Great!\n");
        
        else{
            while(! confirm.contains("Y")){
                System.out.print("\n:(. Do you have your number now? Y/N? ");                
                input = new Scanner(System.in);
                confirm = input.nextLine().toUpperCase();                
            }
            System.out.print("\nGreat!\n");            
        }

        
        while(true){
            count += 1;
            System.out.format("\nGuess #%s", count);
            guess = (lowerLimit + upperLimit)/2;
            System.out.format("\nIs it %s? Y/N? ", guess);
            input = new Scanner(System.in);
            confirm = input.nextLine().toUpperCase();
            
            if(confirm.contains("Y")){
                if(count == 1){
                    System.out.print("I guessed it in 1 try!\n");
                    break;
                }
                System.out.format("I guessed it in %s tries!\n", count);
                break;
            }

            else
                System.out.print("Too high or too low? ");
            
            input = new Scanner(System.in);
            String highLow = input.nextLine().toUpperCase();

            if(highLow.contains("HI"))
                upperLimit = guess;

            else
                lowerLimit = guess;
    
            if(count == Math.round(maxGuess)){
                System.out.print("\nWhoa! Either you picked the perfect number or we've got a cheater over here!\n");
                break;
            }
        }
    }
}
   