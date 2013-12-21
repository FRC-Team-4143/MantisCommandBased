/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marswars.mantis.subystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.marswars.mantis.RobotMap;

/**
 *
 * @author dquam
 */
public class Wings extends Subsystem {

    private Servo leftWing = new Servo(RobotMap.leftWingServo);
    private Servo rightWing = new Servo(RobotMap.rightWingServo);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void extend() {
        leftWing.setAngle(90);
        rightWing.setAngle(0);
    }

    public void tuck() {
        leftWing.setAngle(0);
        rightWing.setAngle(90);
    }
}