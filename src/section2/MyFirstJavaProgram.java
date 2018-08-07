package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		System.out.println("Hello World!");

		Robot lucina = new Robot();
		lucina.miniaturize();
		lucina.setSpeed(500);
		lucina.penDown();

		for (int i = 0; i < 4; i++) {
			lucina.setPenColor(204, 0, 0);

			lucina.setPenWidth(600);
			lucina.turn(-45);
			lucina.move(150);
			lucina.turn(45);
			lucina.move(150);
			lucina.turn(135);
			lucina.move(150);
			lucina.turn(45);
			lucina.move(150);
			lucina.sparkle();
		
		}

	}
}
