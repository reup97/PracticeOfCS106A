package waterFall;

import java.awt.Color;
import acm.graphics.*;


public class SlideBox extends GRect implements Runnable {
	
	public SlideBox(int size, Color color) {
		super(size, size);
		setFilled(true);
		setColor(color);
		
	}
	
	public void run() {
		for (int i = 0; i < 1000 / SPEED; i++) {
			move(0,SPEED);
			pause(DELAY);
		}
	}
	

	private final int SPEED = 4;
	private final int DELAY = 10;
}
