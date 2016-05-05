import java.util.Scanner;
public class DiceGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Dice dice = new Dice (0,0,0);
		System.out.println(dice);
		int playAgain = 0;
		
		do {
			int numberDice = Dice.oneThrow();
			System.out.println("\nThrows #"+dice.getThrowns());
			System.out.print("The Number is "+numberDice);
			
			if ( numberDice %2 == 0)
				System.out.println("\nYour Dice Number is Even");
			else 
				System.out.println("\nYour Dice Number is Odd");
			
			System.out.print("\n\nPress 1 to Play again or 2 to End the Game: ");
			playAgain = in.nextInt();
		}
		while (playAgain == 1 );
		System.out.println(dice);
			
		}

	}


