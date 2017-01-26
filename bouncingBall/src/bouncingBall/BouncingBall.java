package bouncingBall;

import acm.graphics.*;
import acm.program.*;
//import java.awt.event.*;
//import javax.naming.InitialContext;
//import org.omg.CORBA.INTERNAL;
//import org.omg.CORBA.PRIVATE_MEMBER;


public class BouncingBall extends GraphicsProgram {
	
	private void checkImpact() {
		if (obj.getY()+ obj.getHeight() > getHeight() ) {
			Y_VELOCITY = -Y_VELOCITY * DECREASE;
			
			if ( obj.getY() > getHeight()){
				DIFF = obj.getY() - getHeight();
				obj.move(X_VELOCITY, -DIFF * 2);

			}
			
		}
	}
	private void moveObject() {
		obj.move(X_VELOCITY, Y_VELOCITY);
		Y_VELOCITY += GRAVITY;	
	}
	
	private void bounce() {
		while (obj.getX() < getWidth() ) {
			moveObject();
			checkImpact();
			pause(DELAY);
		}
	}
	private void setup() {
		setSize(1000, 2000);
		obj = new GImage("roomate.png");
		obj.setLocation(INIT_LOCATION_X, INIT_LOCATION_Y);
		obj.setSize(DIA, DIA);
		add(obj);
	}
	public void run() {
		setup();
		label = new GLabel("click to start bouncing");
		add(label, 30,30);
		waitForClick();
		bounce();
		
		
	}
	
	
	
	/* instance variables for ball info. */
	private static int DIA = 50;
	private static final int INIT_LOCATION_X = 50;
	private static final int INIT_LOCATION_Y = 50;
	
	
	/* dynamic information */
	private static final double GRAVITY = 3; // velocity changed per frame.
	private static final double X_VELOCITY = 5; // initial velocity in x direction.
	private double Y_VELOCITY = 0;
	private static final double DECREASE = 0.9;
	private double DIFF;
	
	/* time of pause */
	private static final int DELAY = 40;
	
	/* create object */
	GImage obj; 
	GLabel label;
	
	
}
