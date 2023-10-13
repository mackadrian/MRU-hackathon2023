package lifeJourney;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MatchTheShape {

    public void startGame() {
        System.out.println("You are a Toddler");
        System.out.println("Starting Game: Match the Shape..." + '\n');
        System.out.println("Let's match the symbol!");
        System.out.println("Type in the number that's below the matching symbol!" + '\n');
        System.out.println(" A  " + " B " + "  C ");
        System.out.println("(1)" + " (2) " + "(3)");
        System.out.println(" D  " + " E " + "  F ");
        System.out.println("(4)" + " (5) " + "(6)");
        System.out.println(" G  " + " H " + "  I ");
        System.out.println("(7)" + " (8) " + "(9)");

        Scanner userInput = new Scanner(System.in);
        boolean correctShape = false;
        boolean allDone = false;
        int timesCompleted = 0;
        int symbolInput;
        char[] symbolList = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        Random rand = new Random();
        int randomNum;

        while (!allDone) {
            try {
                while (!correctShape) {
                    randomNum = rand.nextInt(symbolList.length - 1);
                    System.out.println("What shape is this? ---> " + symbolList[randomNum]);
                    System.out.print("That shape is: ");
                    symbolInput = userInput.nextInt();
                    if (symbolInput == randomNum + 1) {
                        System.out.println("Great Job!");
                        timesCompleted++;
                    } else {
                        System.out.println("That's not quite right. Please try again!");
                    }

                    if (timesCompleted == 5)
                        correctShape = true;
                        allDone = true;
                }
            }
            catch (InputMismatchException e){
                System.out.println("That's not a number! Exiting...");
            }
        }
        userInput.close();

        if (correctShape == true) {
            System.out.println("Congratulations!");
            System.out.println("You've successfully completed: Match the Shape!");
        }

    }



}
