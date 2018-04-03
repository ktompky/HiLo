import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			// randomly generated number
			int theNumber = (int)(Math.random() * 100 + 1);

			int guess = 0;
			int numGuess = 0;
			
			while (guess != theNumber && numGuess <= 5) {
				System.out.println("Guess a number between 1 and 100");
				guess = scan.nextInt();
				if ( guess < theNumber )
					System.out.println(guess + " is too low. Try again.");
				else if (guess > theNumber )
					System.out.println(guess + " is too high. Try again.");
				else
					System.out.println(guess + " is correct. You win!");
				numGuess += 1;
				
				System.out.println("You are at " + numGuess + " and have " + (6 - numGuess) + " left.");
			}
			if (numGuess <= 5) {
			System.out.println("It took you " + numGuess + " attempts to get this number correct.");
			}
			else if (numGuess >= 6) { 
				System.out.println("You made too many attempts, sorry.");
			}
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thanks for playing! Goodbye!");
		scan.close();
	}

}
