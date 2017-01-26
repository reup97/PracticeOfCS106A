package rollingDIces;

public class Dice {
	
	public int rollDice() {
		// a method that returns the value of the dice after one roll.
		return (int) (Math.random() * 6);
	}
}