package slidingBox;

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
			move(SPEED, 0);
			pause(DELAY);
		}
	}
	

	private final int SPEED = 5;
	private final int DELAY = 30;
}
