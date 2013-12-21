package org.marswars.mantis.commands;

import edu.wpi.first.wpilibj.GenericHID;

public class DriveWithController extends CommandBase {

    public DriveWithController() {
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.arcadeDrive(-1 * oi.xbox.getY(GenericHID.Hand.kLeft), oi.xbox.getX(GenericHID.Hand.kLeft));
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
    }
}
