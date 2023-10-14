package lifeJourney;

public class FinalGame {

    public static void main(String[] args) {
    	
    	System.out.println("Welcome to ?");
    	System.out.println(""); //description

    	System.out.println("You are starting as a Toddler");
        System.out.println("Starting Game: Match the Shape..." + '\n');
        MatchTheShape mtsGame = new MatchTheShape();
        mtsGame.startGame();
        
        System.out.println("You have grown up");
        System.out.println("You are now a Child");
        System.out.println("Starting Game: Math Homework..." + '\n');
        ChildMath mathGame = new ChildMath();
        mathGame.startGame();
        
        System.out.println("You have grown up");
        System.out.println("You are now a Teenager");
        System.out.println("Starting Game: Match the Shape..." + '\n');
        TeenageHood teenGame = new TeenageHood();
        teenGame.startGame();


    }



}