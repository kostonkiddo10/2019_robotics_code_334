package org.usfirst.frc3340.Peter.commands;

import org.usfirst.frc3340.Peter.Robot;
import org.usfirst.frc3340.Peter.subsystems.drive;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class driveCommand extends Command {

    public driveCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.drive.robotDrive.arcadeDrive(Robot.oi.logitech3D.getY(), Robot.oi.logitech3D.getZ());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        Robot.drive.robotDrive.arcadeDrive(0.0, 0.0);
    }
}