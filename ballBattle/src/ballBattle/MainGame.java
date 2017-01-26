package ballBattle;

import acm.graphics.*;
import acm.program.*;

public class MainGame extends GraphicsProgram{
	
	private void checkHitTarget() {
		
	}
	
	private void setTarget(int locx, int locy) {
		target.setSize(WIDTH, HEIGHT);
		target.setLocation(locx, locy);
		add(target);
	}
	private void setPlayer() {
		player = new GRect(X_LOC, Y_LOC);
		player.setSize(DIM,DIM);
		add(player);
	}
	private void setBall() {
		ball = new GImage("roomate.png");
		ball.setSize(DIM,DIM);
		ball.setLocation(getWidth() / 2, getHeight() / 2);
		add(ball);
	}
	
	private void setFrame() {
		GRect frame = new GRect(400, 400);
		add(frame);
	}
	public void run() {
		setSize(500,500);
		setFrame();
		/* generate objects */
		setBall();
		setPlayer();
		setTarget(300,200);
		//checkHitTarget();
		//checkHitPlayer();
		pause(PAUSE);
			
	}
	//
	private final int PAUSE = 50;
	// ball
	public GImage ball;
	public final int DIM = 10;
	public double VELOCITY_Y = 15;
	public double VELOCITY_X = 15;
	// player
	public GRect player;
	public final int DIM_player = 10;
	public double Y_LOC = getHeight()- 200;
	public double X_LOC = 100;
	// target
	public GRect target;
	public int WIDTH = 300;
	public int HEIGHT = 30;
	
}
