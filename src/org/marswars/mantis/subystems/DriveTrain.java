package org.marswars.mantis.subystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.marswars.mantis.RobotMap;
import org.marswars.mantis.commands.DriveWithController;

/**
 *
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private RobotDrive train = new RobotDrive(RobotMap.leftSpeedController, RobotMap.rightSpeedController);
    private Encoder leftEncoder = new Encoder(RobotMap.leftEncoderA, RobotMap.leftEncoderB);
    private Encoder rightEncoder = new Encoder(RobotMap.rightEncoderA, RobotMap.rightEncoderB);

    public DriveTrain() {
        leftEncoder.setDistancePerPulse(RobotMap.angularToLinear / RobotMap.pulsesPerRevolution);
        rightEncoder.setDistancePerPulse(RobotMap.angularToLinear / RobotMap.pulsesPerRevolution);
        start();
    }

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithController());
    }

    public void arcadeDrive(double Y, double X, boolean printOut) {
        train.arcadeDrive(Y, X);
        if (printOut) {
            printDistance();
        }
    }

    private void start() {
        leftEncoder.start();
        leftEncoder.start();
    }

    public void printDistance() {
        SmartDashboard.putDouble("Left Encoder:", leftEncoder.getDistance());
        SmartDashboard.putDouble("Right Encoder:", rightEncoder.getDistance());
    }

    public void reset() {
        leftEncoder.reset();
        rightEncoder.reset();
    }
}
