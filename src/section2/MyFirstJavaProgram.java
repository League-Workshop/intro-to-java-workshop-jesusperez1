package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Guapo=new Robot();
	Guapo.changeRobot("https://www.deere.com/assets/images/region-4/products/tractors/row-crop-tractors/6family-subgroup/7230r-r4d014778.jpg");
Guapo.setSpeed(80);
Guapo.setRandomPenColor();
	Guapo.penDown();
	int sides=45;
			int angle=360/sides;
		for(int i=0;i<sides;i++) {
			Guapo.move(45);
		Guapo.turn(angle);
		}
			
	}
}
