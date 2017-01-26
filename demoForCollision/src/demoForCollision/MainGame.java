package demoForCollision;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class MainGame extends GraphicsProgram{
	
	
	
	public void init() {
		setSize(500,500);
		ob = new Obstacle(obInitX,obInitY);
		user = new GRect(50,50,userInitLocX, userInitLocY);
		add(ob);
		add(user);
		addMouseListeners();
		
		obCenterLocationX = (int) (obInitX + ob.getWidth() / 2);
		obCenterLocationY = (int) (obInitY + ob.getHeight() / 2);
	}
	
	public void mousePressed(MouseEvent e) {
		lastX = e.getX();
		lastY = e.getY();
		
	}
	
	public void mouseDragged(MouseEvent e) {
		if (getElementAt(lastX, lastY) == user) {
			user.move(e.getX() - lastX, e.getY() - lastY);
			lastX = e.getX();
			lastY = e.getY();
		
			int userCenterLocationX = (int) (user.getX() + user.getWidth() / 2);
			int userCenterLocationY = (int) (user.getY() + user.getHeight() / 2);
			
			boolean ok = (Math.abs(userCenterLocationX - obCenterLocationX) < (user.getWidth() + ob.getWidth())/2
					&& Math.abs(userCenterLocationY - obCenterLocationY) < (user.getHeight() + ob.getHeight())/2 );
			System.out.println("Is overlapped? "+ok);
			
			if (ok) {
				ob.setVisible(false);
			} else {
				ob.setVisible(true);
			}
		}
	}
	
	
	private Obstacle ob;
	private GRect user;
	private int obCenterLocationX;
	private int obCenterLocationY;
	private int obInitX = 200;
	private int obInitY = 200;
	
	private int userInitLocX = 100;
	private int userInitLocY = 50;
	
	private int lastX;
	private int lastY;

}
