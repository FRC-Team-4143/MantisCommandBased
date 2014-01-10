/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marswars.mantis.subystems;

    import edu.wpi.first.wpilibj.Jaguar;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.marswars.mantis.RobotMap;

/**
 *
 * @author dquam
 */
public class Climber extends Subsystem {

    private Jaguar leftClimber = new Jaguar(RobotMap.leftClimberController);
    private Jaguar rightClimber = new Jaguar(RobotMap.rightClimberController);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void extend() {
        leftClimber.set(.5);
        rightClimber.set(.5);
    }

    public void retract() {
        leftClimber.set(-.5);
        rightClimber.set(-.5);
    }
}