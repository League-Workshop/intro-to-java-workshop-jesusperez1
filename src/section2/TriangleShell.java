package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {
	int length = 50;
	// 1. Create a new Robot
	Robot Guapo = new Robot();

	void go() {
		// 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		Guapo.setSpeed(100);

		// 4. make a variable to hold the length of the triangle and set it to 50

		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for (int i = 0; i < 60; i++) {
			// 9. Change the color of the pen to a random color
			Guapo.setRandomPenColor();
			// 8. Increase the length variable by 10
			length = length + 10;

			// 5. call your drawTriangle() method using your length variable
			drawTriangle(length);

			// 10. Turn the robot 6 degrees to the right
			Guapo.turn(6);
		}
	}

	/*
	 * 2. fill in the method below to draw a triangle. Use the length variable when
	 * you call move().
	 */
	private void drawTriangle(int length) {
		Guapo.penDown();
		for (int i = 0; i < 3; i++) {
			Guapo.move(length);
			Guapo.turn(360 / 3);
		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
