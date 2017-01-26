package ballBattle;

import acm.graphics.*;
import acm.program.*;

public class Ball extends GraphicsProgram {
	public Ball() {
		ball = new GImage("roomate.png");
		ball.setSize(DIM,DIM);
		ball.setLocation(getWidth() / 2, getHeight() / 2);
		
	}
	public void moveBall() {
		ball.move(VELOCITY_X, VELOCITY_Y);
	}
	

	/* instance variables */
	public GImage ball;
	public final int DIM = 10;
	public double VELOCITY_Y = 15;
	public double VELOCITY_X = 15;
}