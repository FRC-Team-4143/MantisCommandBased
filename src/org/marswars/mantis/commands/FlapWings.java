package org.marswars.mantis.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author dquam
 */
public class FlapWings extends CommandBase {

    public FlapWings() {
        requires(wings);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        wings.extend();
        Timer.delay(0.5);
        wings.tuck();
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
