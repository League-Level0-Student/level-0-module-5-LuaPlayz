package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot bob=new Robot();
public static void main(String[] args) {
	String shape=JOptionPane.showInputDialog(null, "WHAT SHAPE DO YOU WANT MY CHILD? SQUARE, TRIANGLE, OR CIRCLE???");
	bob.penDown();
	bob.setSpeed(100);
	if (shape.equalsIgnoreCase("square")) {
		drawSquare();
	}else if (shape.equalsIgnoreCase("triangle")){
		drawTriangle();
	}else if (shape.equalsIgnoreCase("circle")) {
		drawCircle();
	}
}
	static void drawSquare() {
			for (int i = 0; i < 5; i++)
			{ bob.move(100);
			bob.turn(90);}
			bob.hide();
	}
	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			bob.move(100);
			bob.turn(120);
			bob.hide();
		}
	}
	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			bob.move(1);
			bob.turn(1);
			bob.hide();
		}
	}
	
	
	

}
