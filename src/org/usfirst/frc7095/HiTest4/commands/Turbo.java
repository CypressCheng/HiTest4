// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc7095.HiTest4.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc7095.HiTest4.Robot;

public class Turbo extends Command {

    public Turbo() {
        requires(Robot.base);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
    	Robot.base.drive(Robot.oi.getLeftYVelocity(), Robot.oi.getRightYVelocity());
    	//Robot.base.drive(Math.pow(Robot.oi.getLeftYVelocity(),3), Math.pow(Robot.oi.getRightYVelocity(), 3));//Added ^3 method to prevent accident.
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
    	Robot.base.driveStraight(0);
    }

    @Override
    protected void interrupted() {
    	end();
    }
}
