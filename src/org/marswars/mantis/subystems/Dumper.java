/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marswars.mantis.subystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.marswars.mantis.RobotMap;

/**
 *
 * @author dquam
 */
public class Dumper extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private Servo lid = new Servo(RobotMap.lidServo);
    private Relay dumper = new Relay(RobotMap.dumperRelay, Relay.Direction.kBoth);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void rack() {
        dumper.set(Relay.Value.kReverse);
    }

    public void dump() {
        dumper.set(Relay.Value.kForward);
    }

    public void close() {
        lid.setAngle(0);
    }

    public void open() {
        lid.setAngle(90);
    }

    public boolean isOpen() {
        return Math.abs(lid.getAngle() - 90.) < 1;
    }

    public void stop() {
        dumper.set(Relay.Value.kOff);
    }
}