package lifeJourney;

import java.util.Random;
import java.util.Scanner;

public class ChildMath {
	
	public static void main(String[] args) {
		
		mathGame();
		
	}
	
	
	public static void mathGame() {
		
		Random rand = new Random();
		String[] operations = {"+", "-", "*", "/"};
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		int expectedResult;
		int userResult;
		int select;
		int division;
		int i;
		int right = 0;
		int wrong = 0;
				
		System.out.println("Solve the following Math Problems!");
		System.out.println("Get 5/8 Answers Right to Advance");
		System.out.println("");
		
		while(right < 5) {
			
			num1 = rand.nextInt(51);
			num2 = rand.nextInt(51);
			//picks a random math operation from the operations array
			select = rand.nextInt(operations.length); 
			
			if(operations[select] == "+") {
				expectedResult = num1 + num2;
			} 
			else if(operations[select] == "-") {
				expectedResult = num1 - num2;
			}
			else if(operations[select] == "*") {
				if(num1 > 10) {
					num1 = rand.nextInt(11);
				}
				if(num2 > 10) {
					num2 = rand.nextInt(11);
				}			
				expectedResult = num1 * num2;			
			} 
			else {		
				//picks a random number to get a random case
				i = rand.nextInt(8);
				division = i;
				
				switch(division) {
					case 0:
						num1 = 10;
						num2 = 2;
						break;
					
					case 1:
						num1 = 8;
						num2 = 4;
						break;
					
					case 2:
						num1 = 12;
						num2 = 1;
						break;
					
					case 3:
						num1 = 9;
						num2 = 9;
						break;
						
					case 4:
						num1 = 20;
						num2 = 5;
						break;
					
					case 5:
						num1 = 20;
						num2 = 10;
						break;
					
					case 6:
						num1 = 12;
						num2 = 6;
						break;
					
					case 7:
						num1 = 10;
						num2 = 5;
						break;
						
				}
				expectedResult = num1 / num2;
			}
			
			System.out.println(num1 + " " + operations[select] + " " + num2);
			
			System.out.println("Enter your answer: ");
			userResult = scan.nextInt();
			
			if(userResult != expectedResult) {
				System.out.println("Incorrect Answer, the Correct Answer is " + expectedResult);
				wrong++;
				
				//if wrong 8 times, restarts the minigame
				if(wrong == 8) {
					right = 0;
					wrong = 0;		
					System.out.println("");
					System.out.println("");
					System.out.println("*** Game Over, Back to Square One ***");
					System.out.println("");
				}
				
			}
			else {
				System.out.println("Correct, Good Job!");
				right++;
			}		
			System.out.println("");
		}	
		scan.close();
		
		System.out.println("");
		System.out.println("*** Congratulations, You have Passed this Minigame ***");
		System.out.println("");
	}
		

}
