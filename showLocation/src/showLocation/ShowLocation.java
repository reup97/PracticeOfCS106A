package showLocation;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class ShowLocation extends GraphicsProgram {
	
	/* initialize the size of the canvas 
	 * add mouse listeners to monitor events of mouse */
	public void init() {
		setSize(CANVAS_WIDTH,CANVAS_HEIGHT);
		addMouseListeners();
	}
	
	/* show the location of the mouse 
	 * use .getX() and .getY() to get the location of the 
	 * mouse */
	public void mouseMoved(MouseEvent e) {
		locX = e.getX();
		locY = e.getY();
		label.setFont("Arial-20");
		label.setLabel("Current location:" + locX +", " + locY );
		label.setLocation(X, Y);
		add(label);
	}
	
	/* instance variables */
	/* size of the canvas */
	private final int CANVAS_WIDTH = 500;
	private final int CANVAS_HEIGHT = 500;
	
	/* location of the mouse */
	private int locX = 0;		// initialize the x location of mouse.
	private int locY = 0;		// initialize the y location of mouse.
	
	/* location of the label */
	private final int X = 15;
	private final int Y = 15;
	
	/* create a GLabel object */
	private GLabel label = new GLabel("Current location:" + locX +", " + locY);
}
