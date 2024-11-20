package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Robot {
	private Pos position;
	private Direction facing;
	private Planet planet;
	
	public Robot(Pos position, Direction facing, Planet planet) {
		this.position = position;
		this.facing = facing;
		this.planet = planet;
		
	}
	
	public Pos getPosition() {
		return position;
	}

	public Direction getFacing() {
		return facing;
	}

	public void setFacing(Direction facing) {
		this.facing = facing;
	}

	

	public void move() {
		int x = position.getX();
		int y = position.getY();
		
		int newX = x+(1*facing.getDx());
		int newY = y+(1*facing.getDy());
		
		this.position.setX((newX+planet.getxSize()) % planet.getxSize());
		this.position.setY((newY+planet.getxSize()) % planet.getySize());
		
		
		
	}
	
	public void turn(char rotationSide) {
		ArrayList<Direction> directionList = new ArrayList<>(Arrays.asList(Direction.N,Direction.E,Direction.S,  Direction.W));
		int directionIndex = directionList.indexOf(facing);
		
		if (rotationSide == 'r') {
	        directionIndex = (directionIndex + 1) % directionList.size();
	    } else if (rotationSide == 'l') {
	        directionIndex = (directionIndex - 1) % directionList.size();
	    } else {
	        throw new IllegalArgumentException("rotationSide doit être 'r' ou 'l'");
	    }
		
		facing = directionList.get(directionIndex);
		
	}

	@Override
	public String toString() {
		return "Robot [position=" + position.getX()+","+position.getY() + ", facing=" + facing + "]";
	}
	
	
}
