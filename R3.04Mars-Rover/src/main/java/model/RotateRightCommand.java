package model;

public class RotateRightCommand implements Command {
	private final Robot robot;
	
	public RotateRightCommand(Robot robot) {
		this.robot = robot;
	}

	@Override
	public void execute() {
		robot.turn('r');
	}
}
