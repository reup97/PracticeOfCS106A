package demoForCollision;

import java.awt.Color;
import acm.graphics.*;


public class Obstacle extends GRect {
	public Obstacle(int locX, int locY) {
		super(width, height);
		setFilled(true);
		setColor(Color.BLUE);
		setLocation(locX, locY);
		
	}
	
	
	private static int width = 30;
	private static int height = 50;
}
