/**
 * This program allows user to create ovals of different color and of
 * different fill status by clicking on the canvas. Also this program
 * allows user to drag the object existing on the canvas.*/

package clickForOval;

import acm.graphics.*;
import acm.program.*;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MainGame extends GraphicsProgram {
	public void init() {
		// set the canvas size.
		setSize(SIZE_X,SIZE_Y);
		// add button.
		add(new JButton("Remove all"), SOUTH);
		
		initRadioButtonIsFill();
		
		initComboBox();
		
		addActionListeners();
		addMouseListeners();
	}
	private void initComboBox() {
		color = new JComboBox<String>();
		color.addItem("Black");
		color.addItem("Red");
		color.addItem("Green");
		color.addItem("Yellow");
		color.setEditable(false);
		color.setSelectedItem("Black");
		add(color, SOUTH);
	}
	
	private void initRadioButtonIsFill() {
		fill = new JRadioButton("fill");
		notFill = new JRadioButton("not fill");
		ButtonGroup status = new ButtonGroup();
		status.add(fill);
		status.add(notFill);
		fill.setSelected(true);
		JLabel label = new JLabel(" Set Fill: ");
		add(label, SOUTH);
		add(fill, SOUTH);
		add(notFill, SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Remove all")) {
			removeAll();
		} // end if
	} // end method
	
	public void mouseClicked(MouseEvent e) {
		GOval oval = new GOval(0,0);
		oval.setSize(SIZE_OVAL, SIZE_OVAL);
		if (fill.isSelected()) oval.setFilled(true); //set filled
		
		//set color of the oval
		if (color.getSelectedItem().equals("Black")) oval.setColor(Color.BLACK);
		if (color.getSelectedItem().equals("Red")) oval.setColor(Color.RED);
		if (color.getSelectedItem().equals("Green")) oval.setColor(Color.GREEN);
		if (color.getSelectedItem().equals("Yellow")) oval.setColor(Color.YELLOW);
		
		//add to canvas
		add(oval, e.getX(),e.getY());
	}// end method
	
	public void mousePressed(MouseEvent e) {
		lastX = e.getX();
		lastY = e.getY();
	}// end method
	
	/* allow users to drag the object created */
	public void mouseDragged(MouseEvent e) {
		obj = getElementAt(lastX, lastY);
		if (obj != null) {
			obj.move(e.getX()-lastX, e.getY()-lastY);
			lastX = e.getX();
			lastY = e.getY();
		} // end if		
	} // end method
	
	public void mouseMoved(MouseEvent e) {
		mouseLocX = e.getX();
		mouseLocY = e.getY();
		pos.setLocation(mouseLocX, mouseLocY);
		pos.setFont("Tahoma-12");
		pos.setLabel("Current position: " +mouseLocX +", " + mouseLocY );
		add(pos, labelLocationX ,labelLocationY );
	}
	
	
	/* instance variables */
	private final int SIZE_X = 500;		// x dimension of the canvas
	private final int SIZE_Y = 500;		// y dimension of the canvas
	private final int SIZE_OVAL = 50;	// size of the oval
	private int lastX;					// last location of the mouse
	private int lastY;					// last location of the mouse
	private int mouseLocX = 0;
	private int mouseLocY = 0;
	private final int labelLocationX = 10;
	private final int labelLocationY =10;
	
	private GObject obj;
	private JRadioButton notFill;
	private JRadioButton fill;
	private JComboBox<String> color;
	private GLabel pos = new GLabel("Current position: " +mouseLocX +", " + mouseLocY );
}
