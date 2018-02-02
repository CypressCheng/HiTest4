// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc7095.HiTest4.subsystems;

import org.usfirst.frc7095.HiTest4.RobotMap;
import org.usfirst.frc7095.HiTest4.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

public class Sucker extends Subsystem {
    private final SpeedController left = RobotMap.suckerLeft;
    private final SpeedController right = RobotMap.suckerRight;

    @Override
    public void initDefaultCommand() {
    }

    @Override
    public void periodic() {
    }

    public void rotate(double speed) {
    	//Not tested yet.
    	left.set(speed);
    	right.set(-speed);
    }

}

