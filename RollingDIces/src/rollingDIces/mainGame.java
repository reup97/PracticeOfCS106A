package rollingDIces;

import java.util.Scanner;

public class mainGame {
	private static final int NUM_SIDE = 6;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int numDice = sc.nextInt();
		int maxNum = numDice * NUM_SIDE;
		//initialize total
		int total = 0;
		int count = 0;
		//loop through
		while (true) {
			Dice myDice = new Dice();
			total += (int) myDice.rollDice();
			count ++;
			if ( total == maxNum) break;
		}
		System.out.println(count + " times of rolling is needed to reach the hightst.");
	}

}