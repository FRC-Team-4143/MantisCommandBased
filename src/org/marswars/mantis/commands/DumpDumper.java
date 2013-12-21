package org.marswars.mantis.commands;

/**
 *
 * @author dquam
 */
public class DumpDumper extends CommandBase {

    public DumpDumper() {
        requires(dumper);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (dumper.isOpen()) {
            dumper.close();
        }
        dumper.dump();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        dumper.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        dumper.stop();
    }
}
