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
    public static final int leftEncoderA = 3;
    public static final int leftEncoderB = 4;
    public static final int rightEncoderA = 5;
    public static final int rightEncoderB = 6;
    public static final int pulsesPerRevolution = 1;
    public static final double angularToLinear = 1.; // if the encoder is right on the wheel, this is just the circumference of the tire in mm
}
