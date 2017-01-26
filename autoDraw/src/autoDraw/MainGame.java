/** this program generates two layers of ovals overlap each other.*/

package autoDraw;

import acm.graphics.*;
import acm.program.*;
import java.awt.Color;
public class MainGame extends GraphicsProgram {
	
	private void drawLayer() {
		for( int x = 0; x < 2; x++) {
			for (int i = INIT_X;i < CANVAS_SIZE_X;i+=SIZE_OVAL_X) {
				for (int j = INIT_Y;j < CANVAS_SIZE_Y;j+=SIZE_OVAL_Y) {
					Oval o = new Oval(SIZE_OVAL_X,SIZE_OVAL_Y);
					o.setLocation(i, j);
					add(o);
				} // end most inner loop
			} // end  middle loop	
			INIT_X = SIZE_OVAL_X / 2; // create the initiation for second layer
			INIT_Y = SIZE_OVAL_Y / 2; // create the initiation for second layer
		} // end most outer loop,
	} // end method
	
	public void run() {
		setSize(CANVAS_SIZE_X,CANVAS_SIZE_Y);
		// draw two layers of ovals.
		drawLayer();
	} // end run
	
	
	/* instance variables */
	private final int CANVAS_SIZE_X = 500;
	private final int CANVAS_SIZE_Y = 500;
	private int INIT_X = 0;
	private int INIT_Y = 0;
	private final int NUM_OVAL = 20;
	private final int SIZE_OVAL_X = CANVAS_SIZE_X / NUM_OVAL;
	private final int SIZE_OVAL_Y = CANVAS_SIZE_Y / NUM_OVAL;
}
