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

    private Jaguar Climber = new Jaguar(RobotMap.ClimberController);
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void extend() {
        Climber.set(.5);
        
    }

    public void retract() {
        Climber.set(-.5);       
    }
    
    public void stop() {
        Climber.set(0);       
    }
}