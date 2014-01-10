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
public class ClimberExtend extends CommandBase {

    public ClimberExtend () {
        requires(climber);
    }
    
    protected void initialize() {
        
    }

    protected void execute() {
        climber.extend();
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
