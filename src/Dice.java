
public class Dice {

	private static int evenDice;
	private static int oddDice;
	private static int Throwns;
	
	public Dice (int Thrown, int evenDice, int oddDice) {
		this.evenDice = evenDice;
		this.oddDice = oddDice;
		this.Throwns = Thrown;
		
	}
	
	public static int getThrowns(){
		return Throwns;
		
	}
	public static int oneThrow()
	{
		Throwns++;
		
		int randomNumber = 1+(int)(Math.random()*6);
		{
			if  (randomNumber %2==0)
				evenDice++;
			else
				oddDice++;
		}
		return randomNumber;
		
		}
	public static int count (int dices, int bounces){
		int random = (dices*(1+(int)(Math.random()*6))) + bounces;
		return random;
		
		
	}
	public String toString()
	{
		return String.format("\nDice Summary-\nTimes Thrown: %d\nOdd Times: %d\nEven Times: %d",
				Throwns,oddDice,evenDice);
		
	}
	
}
