package org.marswars.mantis.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.marswars.mantis.OI;
import org.marswars.mantis.subystems.Climber;
import org.marswars.mantis.subystems.DriveTrain;
import org.marswars.mantis.subystems.Dumper;
import org.marswars.mantis.subystems.Winch;
import org.marswars.mantis.subystems.Wings;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use
 * CommandBase.exampleSubsystem
 *
 * @author dquam
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static DriveTrain driveTrain = new DriveTrain();
    public static Climber climber = new Climber();
    public static Dumper dumper = new Dumper();
    public static Winch winch = new Winch();
    public static Wings wings = new Wings();

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(driveTrain);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
