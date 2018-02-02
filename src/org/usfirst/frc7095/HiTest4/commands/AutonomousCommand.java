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

public class AutonomousCommand extends Command {
    public AutonomousCommand() {
    	requires(Robot.base);
    	requires(Robot.sucker);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
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
