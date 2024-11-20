package model;

public class Main {

	public static void main(String[] args) {
		Planet mars = new Planet(100,100);
		Robot marsRover = new Robot(new Pos(98,0),Direction.N,mars);
		
		Remote roverRemote = new Remote();
		Command turnLeft = new RotateLeftCommand(marsRover);
		Command turnRight = new RotateRightCommand(marsRover);
		Command move = new MoveCommand(marsRover);
		
		roverRemote.setCommand(turnRight);
		roverRemote.pressButton();
		roverRemote.setCommand(move);
		roverRemote.pressButton();
		System.out.println(marsRover.toString()); 
		
		roverRemote.setCommand(move);
		roverRemote.pressButton();
		System.out.println(marsRover.toString()); 
		
		roverRemote.setCommand(move);
		roverRemote.pressButton();
		System.out.println(marsRover.toString()); 
		
		roverRemote.setCommand(move);
		roverRemote.pressButton();
		System.out.println(marsRover.toString()); 
		roverRemote.setCommand(turnRight);
		roverRemote.pressButton();
		roverRemote.setCommand(move);
		roverRemote.pressButton();
		System.out.println(marsRover.toString());
		
		
		
		

	}

}
