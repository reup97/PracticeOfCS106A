package waterFall;

import acm.program.*;
import acm.util.RandomGenerator;
import java.awt.event.MouseEvent;


public class MainGame extends GraphicsProgram {
	
	public static void main(String[] args) {
		new MainGame().start(args);
	}
	
	public void init() {
		
		setSize(CANVAS_SIZE_X,CANVAS_SIZE_Y);
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e) {
		SlideBox slider = new SlideBox(SIZE, rgen.nextColor());
		add(slider, e.getX(), e.getY() );
		Thread t = new Thread(slider);
		t.start();
	}
	
	public void mouseClicked(MouseEvent e) {
		SlideBox slider = new SlideBox(SIZE * 2, rgen.nextColor());
		add(slider, e.getX(), e.getY() );
		Thread t = new Thread(slider);
		t.start();
	}

	
	
	private RandomGenerator rgen = new RandomGenerator();
	private final int SIZE = 10;
	private final int CANVAS_SIZE_X = 500;
	private final int CANVAS_SIZE_Y = 500;
}
