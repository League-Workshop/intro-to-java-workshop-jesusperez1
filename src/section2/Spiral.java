package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Guapo=new Robot();
		
		// 5. Set your robot's pen down 
		Guapo.penDown();
		// 3. Set the robot to go at max speed (100)
		Guapo.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		int sides=7;
		int angle=360/sides;	
		for (int i=0; i<75;i++) {
			// 7. Change the pen color to random
					Guapo.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
					Guapo.move(5*i);
			// 2. Turn the robot 360/7 degrees to the right
						Guapo.turn(360/sides);				
		
			// 8. Set the pen width to i
						Guapo.setPenWidth(i);
			}
	}
}
