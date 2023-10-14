package lifeJourney;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleChoice {
	
	public static void startGame() {
		
		Scanner userInput = new Scanner(System.in);
		String[] answers = {"C", "A", "D", "B", "A", "D", "D", "B", "A"};
		String[] userResponses = {"", "", "", "", "", "", "", "", "", ""};
		
		System.out.println("You have grown up and have entered childhood!");
        System.out.println("Many lessons are going to be taught through school.");
        System.out.println("For many, it begins with expanding vocabulary!" + '\n');
        
        System.out.println("Type in the letter that correctly matches the answer:");
        System.out.println(" A) " + " B) " + " C) " + " D) " + '\n');
        
        
        System.out.println("1. ___ are coming to my birthday! " + '\n');
        System.out.println("A) It");
        System.out.println("B) Them");
        System.out.println("C) They");
        System.out.println("D) That");
        userResponses[0] = userInput.next();
        
        System.out.println("2. What is the biggest ocean in the world?" + '\n');
        System.out.println("A) Pacific Ocean");
        System.out.println("B) Indian Ocean");
        System.out.println("C) Atlantic Ocean");
        System.out.println("D) Arctic Ocean");
        userResponses[1] = userInput.next();
        
        System.out.println("3. Which word is the contraction of each other?" + '\n');
        System.out.println("A) Its - it is");
        System.out.println("B) Can't - could not");
        System.out.println("C) Doesn't - do not");
        System.out.println("D) You're - you are");
        userResponses[2] = userInput.next();   
              
        System.out.println("4. What is the biggest planet in our solar system?" + '\n');
        System.out.println("A) Mars");
        System.out.println("B) Jupiter");
        System.out.println("C) Mercury");
        System.out.println("D) Earth");
        userResponses[3] = userInput.next();
        
        System.out.println("5. What is the correct synonym for the following:");
        System.out.println("1. Smile" + '\n');
        System.out.println("A) Grin");
        System.out.println("B) Scream");
        System.out.println("C) Look");
        System.out.println("D) Frown");
        userResponses[4] = userInput.next();
        
        System.out.println("6. What are NOT reptiles?");
        System.out.println("A) Lizards");
        System.out.println("B) Tortoises");
        System.out.println("C) Crocodiles");
        System.out.println("D) Hippopotamuses");
        userResponses[5] = userInput.next();
        
        System.out.println("7. How many continents are there in the world?" + '\n');
        System.out.println("A) 3");
        System.out.println("B) 8");
        System.out.println("C) 5");
        System.out.println("D) 7");
        userResponses[6] = userInput.next();
        
        System.out.println("8. What is the capital of Canada?" + '\n');
        System.out.println("A) Toronto");
        System.out.println("B) Ottawa");
        System.out.println("C) Montreal");
        System.out.println("D) Calgary");
        userResponses[7] = userInput.next();
        
        System.out.println("9. What is the correct boiling point of water in Celsius degrees?" + '\n');
        System.out.println("A) 100");
        System.out.println("B) 0");
        System.out.println("C) 35");
        System.out.println("D) -100");
        userResponses[8] = userInput.next();       
        
        System.out.println("");
        System.out.println("How did you do?");
        int score = 0;
        for (int i = 0; i < 9; i++) {
        	if (userResponses[i].equalsIgnoreCase(answers[i])) {
        		score++;
        	}
        }
        System.out.println("Score: " + score + "/9");
        
        if (score > 5) {
        	System.out.println("Congratulations! You have passed!");
        }
        else {
        	System.out.println("Unfortunately you have not passed. Please try again!");
        }
	}
}
