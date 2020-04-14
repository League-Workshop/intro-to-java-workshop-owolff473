package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
		Robot shadowthecat = new Robot();
		Robot katagid = new Robot ();
		Robot mayaron = new Robot ();
		
		mayaron.penDown();
		mayaron.setSpeed(100);
		mayaron.setPenColor(30, 1, 69);
		
		int sides = 5;
		int angle = 20;
		
		for (int i = 0; i < 200; i++) {
			mayaron.move(i);
			mayaron.turn(20);
			mayaron.turn(1);
		}
		
		katagid.penDown();
		katagid.setSpeed(100);
		for (int i = 0; i < 75; i++) {
		katagid.setRandomPenColor();
		katagid.move(5*i);
		katagid.turn(360/7);
		katagid.setPenWidth(i);
			
		}
				
	for (int i = 0; i < 10; i++) {shadowthecat.penDown();
	shadowthecat.setRandomPenColor();
	shadowthecat.move(90);
	shadowthecat.turn(90);
	shadowthecat.move(90);
	shadowthecat.turn(90);
	shadowthecat.move(90);
	shadowthecat.turn(90);
	shadowthecat.move(90);
	shadowthecat.turn(90);
	shadowthecat.penUp();
	shadowthecat.move(1);
		
	}
				
	}
}
