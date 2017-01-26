package simpleTestField;

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleTestField extends ConsoleProgram{
	
	public void init() {
		setSize(500,500);
		tf = new JTextField(10);
		tf.setActionCommand("Enter");
		add(new JLabel("Type here:"),SOUTH);		
		add(tf, SOUTH);
		tf.addActionListener(this);
		add(new JButton("Enter"), SOUTH);
		addActionListeners();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Enter")) {
			println("You typed :" + tf.getText());
		}
	}
	
	private JTextField tf;
	
	
}
