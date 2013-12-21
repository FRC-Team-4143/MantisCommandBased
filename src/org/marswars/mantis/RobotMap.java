package org.marswars.mantis;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public static final int leftSpeedController = 1;
    public static final int rightSpeedController = 2;
    public static final int lidServo = 4;
    public static final int rightWingServo = 5;
    public static final int leftWingServo = 6;
    public static final int winchRelay = 2;
    public static final int dumperRelay = 3;
    public static final int xboxControllerPort = 1;
    public static final int accelerometerChannel = 7;
}
