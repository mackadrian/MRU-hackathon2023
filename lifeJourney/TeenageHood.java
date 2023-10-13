package lifeJourney;

import java.util.InputMismatchException;
import java.util.Scanner;
public class TeenageHood {
    public void startGame() {
        System.out.println("You are a Teenager!");
        System.out.println("You will have to make important decisions that will shape your life!");
        System.out.println("Choose from a list of options 4 times a day for 5 days to influence your "
                + "Relationships, Money, Mood, Health, and Intelligence..." + '\n');

        String relationship = "Family";
        String[] money = {"Broke","Some Money", "Decent Savings", "Considerable Savings", "Well off"}; //0-4 indices from broke to well off
        String[] mood = {"Depressed", "Sad", "Neutral", "Content", "Happy"}; //0-4 indices from depressed to happy
        String[] health = {"Very Poor Health", "Poor Health", "No Complications", "Decent Health", "Great Health"};//0-4 indices from very poor health to great
        String[] intelligence = {"Dull", "A Bit Slow", "Average", "Smart", "Brilliant"}; //0-4 indices from dull to brilliant
        int moneyCount = 0, //start broke
            moodCount = 4, //start happy
            healthCount = 4, //start healthy
            intelligenceCount = 0; //start dull
        int day = 1;
        System.out.println("Current Status:" + '\n' + "Day" + day);
        System.out.println("*************************");
        System.out.println("Relationships: " + relationship);
        System.out.println("Money: " + money[moneyCount]);
        System.out.println("Mood: " + mood[moodCount]);
        System.out.println("Health: " + health[healthCount]);
        System.out.println("Intelligence: " + intelligence[intelligenceCount]);
        System.out.println("*************************");

        System.out.println("It's Day " + day + ", what would you like to do today?");
        System.out.println("1) Go to school");
        System.out.println("2) Skip school to work");
        System.out.println("3) Skip school to socialize");

        Scanner userInput = new Scanner(System.in);
        try {
            int choice = userInput.nextInt();
            if (choice == 1) {
                mood
            }
        }
        catch (InputMismatchException e) {
            System.out.println("That's not a number! Exiting...");
        }
    }
}
