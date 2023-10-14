package lifeJourney;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class TeenageHood {
    public static void startGame() {
        System.out.println("You are a Teenager!");
        System.out.println("You will have to make important decisions that will shape your life!");
        System.out.println("Choose from a list of options 2 times a day for 5 days to influence your "
                + "Relationships, Money, Mood, Health, and Intelligence..." + '\n');

        String relationship = "Family";
        boolean socialized = false,
                hasFriends = false,
                hasSignificantOther = false;
        String[] money = {"Broke","Some Money", "Decent Savings", "Considerable Savings", "Well off"}; //0-4 indices from broke to well off
        String[] mood = {"Depressed", "Sad", "Neutral", "Content", "Happy"}; //0-4 indices from depressed to happy
        String[] health = {"Very Poor Health", "Poor Health", "No Complications", "Decent Health", "Great Health"};//0-4 indices from very poor health to great
        String[] intelligence = {"Dull", "A Bit Slow", "Average", "Smart", "Brilliant"}; //0-4 indices from dull to brilliant
        int moneyCount = 0, //start broke
            moodCount = 4, //start happy
            healthCount = 2, //start with no complications
            intelligenceCount = 0; //start dull
        int day = 1;
        System.out.println("Current Status:" + '\n' + "Day " + day);
        System.out.println("*************************");
        System.out.println("Relationships: " + relationship);
        System.out.println("Money: " + money[moneyCount]);
        System.out.println("Mood: " + mood[moodCount]);
        System.out.println("Health: " + health[healthCount]);
        System.out.println("Intelligence: " + intelligence[intelligenceCount]);
        System.out.println("*************************");

        Scanner userInput = new Scanner(System.in);
        //start of a day
        while (day <= 5) {
            socialized = false;
            System.out.println("It's Day " + day + ", what would you like to do today?");
            System.out.println("1) Go to school");
            System.out.println("2) Skip school to work");
            System.out.println("3) Skip school to socialize");

            try {
                int firstChoice = userInput.nextInt();
                if (firstChoice == 1) {
                    intelligenceCount++;
                    moodCount--;
                    System.out.println("School has finished, what would you like to do?");
                    System.out.println("1) Hobbies");
                    System.out.println("2) Exercise");
                    System.out.println("3) Study");
                    System.out.println("4) Socialize");
                    int secondChoice = userInput.nextInt();
                    if (secondChoice == 1) {
                        moodCount++;
                        moneyCount--;
                    }
                    if (secondChoice == 2) {
                        healthCount++;
                    }
                    if (secondChoice == 3) {
                        intelligenceCount++;
                        moodCount--;
                    }
                    if (secondChoice == 4) {
                        moodCount++;
                        socialized = true;
                    }
                }

                if (firstChoice == 2) {
                    moneyCount++;
                    moodCount--;
                    System.out.println("Work has finished, what would you like to do?");
                    System.out.println("1) Hobbies");
                    System.out.println("2) Exercise");
                    System.out.println("3) Study");
                    System.out.println("4) Socialize");
                    int secondChoice = userInput.nextInt();
                    if (secondChoice == 1) {
                        moodCount++;
                        moneyCount--;
                    }
                    if (secondChoice == 2) {
                        healthCount++;
                    }
                    if (secondChoice == 3) {
                        intelligenceCount++;
                        moodCount--;
                    }
                    if (secondChoice == 4) {
                        moodCount++;
                        socialized = true;
                    }
                }
                if (firstChoice == 3) {
                    socialized = true;
                    moodCount++;
                    System.out.println("You've finished socializing, what would you like to do?");
                    System.out.println("1) Hobbies");
                    System.out.println("2) Exercise");
                    System.out.println("3) Study");
                    int secondChoice = userInput.nextInt();
                    if (secondChoice == 1) {
                        moodCount++;
                        moneyCount--;
                    }
                    if (secondChoice == 2) {
                        healthCount++;
                    }
                    if (secondChoice == 3) {
                        intelligenceCount++;
                        moodCount--;
                    }
                }
            }
            catch (InputMismatchException e) {
                System.out.println("That's not a number! Exiting...");
            }

            if (moodCount < 0) {//possible to get negative value here
                moodCount = 0;
            }
            if (moneyCount < 0) {//possible to get negative value here
                moneyCount = 0;
            }
            //next values cannot be negative but can be greater than 9. 10/2 = 5 -> out of range for our String arrays.
            if (moodCount > 4) {
                moodCount = 4;
            }
            if (moneyCount > 4) {
                moneyCount = 4;
            }
            if (intelligenceCount > 4) {
                intelligenceCount = 4;
            }
            if (healthCount > 4) {
                healthCount = 4;
            }
            if (socialized) {
                Random rand = new Random();
                int randInt = rand.nextInt(100);
                if (randInt < 60 && !hasFriends) {
                    hasFriends = true;
                    relationship += " + Friends";
                    System.out.println("Congratulations you made friends!");
                }
                if (randInt < 30 && hasFriends && !hasSignificantOther) {
                    hasSignificantOther = true;
                    relationship += " + Significant Other!";
                    System.out.println("Congratulations you have a Significant Other!");
                }
            }

            System.out.println("-------------------------");
            System.out.println("Thats the end of day " + day +'!');
            System.out.println("Your updated status' are:");
            System.out.println("*************************");
            System.out.println("Relationships: " + relationship);
            System.out.println("Money: " + money[moneyCount]);
            System.out.println("Mood: " + mood[moodCount]);
            System.out.println("Health: " + health[healthCount]);
            System.out.println("Intelligence: " + intelligence[intelligenceCount]);
            System.out.println("*************************");
            day++;
        }
        userInput.close();

        System.out.println("How did your Teenage Life go? Lets see...");
        System.out.println("Your updated status' are:");
        System.out.println("*************************");
        System.out.println("Relationships: Family ---> " + relationship);
        System.out.println("Money: " + money[0] + " ---> " + money[moneyCount]);
        System.out.println("Mood: " + mood[4] + " ---> " + mood[moodCount]);
        System.out.println("Health: " + health[2] + " ---> " + health[healthCount]);
        System.out.println("Intelligence: " + intelligence[0] + " ---> " + intelligence[intelligenceCount]);
        System.out.println("*************************");
    }



}
