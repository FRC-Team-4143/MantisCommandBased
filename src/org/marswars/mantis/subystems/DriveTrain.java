package org.marswars.mantis.subystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.marswars.mantis.RobotMap;
import org.marswars.mantis.commands.DriveWithController;

/**
 *
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private RobotDrive train = new RobotDrive(RobotMap.leftSpeedController, RobotMap.rightSpeedController);

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithController());
    }

    public void arcadeDrive(double Y, double X) {
        train.arcadeDrive(Y, X);
    }
}
