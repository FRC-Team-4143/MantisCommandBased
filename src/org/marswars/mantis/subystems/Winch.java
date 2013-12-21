/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marswars.mantis.subystems;

import edu.wpi.first.wpilibj.Accelerometer;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.marswars.mantis.RobotMap;

/**
 *
 * @author dquam
 */
public class Winch extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private Relay winch;
    private Accelerometer accelerometer;

    public Winch() {
        this.winch = new Relay(RobotMap.winchRelay, Relay.Direction.kBoth);
        this.accelerometer = new Accelerometer(RobotMap.accelerometerChannel);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void tiltForward() {
        winch.set(Relay.Value.kReverse);
    }

    public void tiltBackward() {
        winch.set(Relay.Value.kForward);
    }

    public void stop() {
        winch.set(Relay.Value.kOff);
    }
    
    public boolean isLevel() {
        return Math.abs(accelerometer.getAcceleration()) < 0.2;
    }
}