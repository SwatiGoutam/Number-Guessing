import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
  public static void main(String args[])
    {
	 Scanner scanner =  new Scanner(System.in);
	 Random random = new Random();
	 
	 int minRange = 1;
	 int maxRange = 100;
	 int maxAttempts = 10;
	 int rounds = 0;
	 int totalAttempts = 0;
	 
	 System.out.println("Welcome to the Number Guessing Game!");
	 
	 do{
	    int targetNumber = random.nextInt(maxRange - minRange + 1)+ minRange;
		int attempts = 0;
		
		System.out.println("\nRound" +(rounds + 1));
		System.out.println("Guess the number between " + minRange + "and" + maxRange + ":");
		
	 while(attempts < maxAttempts){
	   int userGuess = scanner.nextInt();
	   attempts++;
	   
	   if(userGuess == targetNumber){
	      System.out.println("The number guessed is correct! You guessed the correct number in");
		  totalAttempts += attempts;
		  break;		
	   }else if(userGuess < targetNumber){
	      System.out.println("Too low! try again,");
	   }else{
	       System.out.println("Too high! Try again,");
	   }
	   
	   if(attempts == maxAttempts){
	      System.out.println("Genaration Failed, you's reached the maximum limit The correct number.");
	   }
	  }
	  
	  rounds++;
	  System.out.println("\nDo you want to play again? (1 for Yes, 0 for no):");
	 }while(scanner.nextInt() == 1);
	  System.out.println("Thanks for playing! Your total score is:" + (rounds - totalAttempts));
	  scanner.close();
	 
	}
}	