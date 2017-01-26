package myGame;


public class MainGame {
	// create three players 
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();
	
	// initialize variables 
	int guessp1 = 0;
	int guessp2 = 0;
	int guessp3 = 0;
	boolean p1Right = false;
	boolean p2Right = false;
	boolean p3Right = false;
	int targetValue = getTargetValue();
	
	public void guessValue() {
		// get values
		p1.getValue();
		p2.getValue();
		p3.getValue();
		// pass values to guessp_ 
		guessp1 = p1.number;
		guessp2 = p2.number;
		guessp3 = p3.number;
	}
	
	public int getTargetValue() {
		return  (int) (Math.random() * 20);
	}
	public boolean compareValue(int ok) {
		if (ok == targetValue) {
			return true;
		} else {
			return false;
		}
	}
	public void printResult() {
		guessValue();
		System.out.println("The answer is " + targetValue);
		System.out.println("Player1's answer is " + guessp1);
		System.out.println("Player2's answer is " + guessp2);
		System.out.println("Player3's answer is " + guessp3);
	}
	
	
	
	public boolean getResult(boolean ok1, boolean ok2 , boolean ok3) {
		if (ok1 || ok2 || ok3) {
			System.out.println("We have a winner!");
			return true;
		} else {
			return false;
		}
	}
	
	public void startGame() {
		while (true) {
			printResult();
			p1Right = compareValue(guessp1);
			p2Right = compareValue(guessp2);
			p3Right = compareValue(guessp3);
			boolean res = getResult(p1Right,p2Right,p3Right);
			if (res) {
				break;
			}
			System.out.println("\n");
		}
	}
		
		
	}
	
	
	
	
	


