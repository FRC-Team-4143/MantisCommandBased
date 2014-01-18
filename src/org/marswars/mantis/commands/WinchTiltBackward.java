/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marswars.mantis.commands;

/**
 *
 * @author Connor
 */
public class WinchTiltBackward extends CommandBase {
    
    public WinchTiltBackward() {
        requires(winch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        winch.tiltBackward();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        winch.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        winch.stop();
    }
        
}
    