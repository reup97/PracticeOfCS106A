package ballBattle;

import acm.graphics.*;
import acm.program.*;

public class Target extends GraphicsProgram {
	public Target(int locX, int locY) {
		GRect target = new GRect(locX,locY);
		target.setSize(WIDTH, HEIGHT);
	}
	
	public int WIDTH = 150;
	public int HEIGHT = 30;
}
