package slidingBox;

import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class MainGame extends GraphicsProgram {
	public void init() {
		setSize(CANVAS_SIZE_X,CANVAS_SIZE_Y);
		add(new JButton("Add"), SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Add")) {
			SlideBox slider = new SlideBox(SIZE, rgen.nextColor());
			add(slider,INIT_X, rgen.nextInt(0, getHeight()));
			Thread t = new Thread(slider);
			t.start();
		}
	}
	
	
	private RandomGenerator rgen = new RandomGenerator();
	private final int SIZE = 50;
	private final int CANVAS_SIZE_X = 500;
	private final int CANVAS_SIZE_Y = 500;
	private final int INIT_X = 0;
}
