package ballBattle;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class Player extends GraphicsProgram {
	public void init() {
		addMouseListeners();
	}
	public Player() {
		player = new GRect(X_LOC, Y_LOC);
		player.setSize(DIM,DIM);
		player.setLocation(getWidth(), getHeight());
	}
	
	public void MouseDragged(MouseEvent e) {
		
	}

	/* instance variables */
	public GRect player;
	public final int DIM = 10;
	public double Y_LOC = getHeight();
	public double X_LOC;
}