/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marswars.mantis.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Connor
 */
public class ClimberRetract extends CommandBase {

    public ClimberRetract () {
        requires(climber);
    }
    
    protected void initialize() {
        
    }

    protected void execute() {
        climber.retract();
        Timer.delay(.5);
    }

    protected boolean isFinished() {
        return false;
    }
        
    protected void end() {
       
    }

    protected void interrupted() {
        
        
    }
        
    
    
}
