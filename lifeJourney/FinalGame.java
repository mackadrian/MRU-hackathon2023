package lifeJourney;

public class FinalGame {

    public static void main(String[] args) {
    		
    	System.out.println("Welcome to You Are..." + '\n');
    	
    	System.out.println("You are starting as a Toddler");
        System.out.println("Starting Game: Match the Shape..." + '\n');
        MatchTheShape.startGame();
        
        System.out.println("");
        System.out.println("You have grown up");
        System.out.println("You are now a Child");     
        System.out.println("Starting Game: Triva..." + '\n');
        MultipleChoice.startGame();      
        System.out.println("Starting Game: Math Homework..." + '\n');
        ChildMath.startGame();
        
        System.out.println("");
        System.out.println("You have grown up");
        System.out.println("You are now a Teenager");
        System.out.println("Starting Game: Match the Shape..." + '\n');
        TeenageHood.startGame();


    }



}