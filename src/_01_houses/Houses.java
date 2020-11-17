package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	public void run() {
		
		rob.setX(70);
		rob.setY(500);
		rob.setSpeed(50);
		rob.setPenWidth(5);
		rob.penDown();
		for (int i = 0; i <3; i++) {
			flatHouse("large","blue");
			coneHouse("small","red");
		}

	}
	public void flatHouse(String size, String color) {
		
		if (color.equalsIgnoreCase("blue")){
			rob.setPenColor(0,0,255);
		}
		if (color.equalsIgnoreCase("green")){
			rob.setPenColor(0,255,0);
		}
		if (color.equalsIgnoreCase("red")){
			rob.setPenColor(255,0,0);
		}
		int height = 200;
		if (size.equalsIgnoreCase("small")) {
			height = height -= 140;
		}
		if (size.equalsIgnoreCase("medium")) {
			height = height -= 50;
		}
		if (size.equalsIgnoreCase("large")) {
			height = height += 50;
		}
		
		rob.move(height);
		rob.turn(90);
		rob.move(70);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0,255,0);
		rob.move(70);
		rob.setPenColor(0,0,0);
		rob.turn(-90);
	}
	public void coneHouse(String size, String color) {
		if (color.equalsIgnoreCase("blue")){
			rob.setPenColor(0,0,255);
		}
		if (color.equalsIgnoreCase("green")){
			rob.setPenColor(0,255,0);
		}
		if (color.equalsIgnoreCase("red")){
			rob.setPenColor(255,0,0);
		}
		int height = 200;
		if (size.equalsIgnoreCase("small")) {
			height = height -= 140;
		}
		if (size.equalsIgnoreCase("medium")) {
			height = height -= 50;
		}
		if (size.equalsIgnoreCase("large")) {
			height = height += 50;
		}
		
			rob.move(height);
			rob.turn(45);
			rob.move(50);
			rob.turn(90);
			rob.move(50);
			rob.turn(45);
			rob.move(height);
			rob.turn(-90);
			rob.setPenColor(0,255,0);
			rob.move(70);
			rob.setPenColor(0,0,0);
			rob.turn(-90);
			
	}
			
			
			
		
		

		
	

}
