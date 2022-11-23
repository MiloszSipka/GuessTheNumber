import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		System.out.println("I'm thinking about number between 0-100, can you guess it?");
		Random random = new Random();
		int number = random.nextInt(101);
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		int attempts = 1;
		
		while(userInput != number) {
			if(userInput < 0 || userInput > 100)
		{
			System.out.println("This number is outside the scope of the game!");
		}
			else if(userInput > number) {
			System.out.println("The number that you're looking for is less");
		}
			else if(userInput < number) {
			System.out.println("The number that you're looking for is more");
		}
			attempts++;
			userInput = scanner.nextInt();
	}
		System.out.println("You're correct! The number is: " + userInput);
		System.out.println("It took you: " + attempts + " attempts to guess.");
	}

}
