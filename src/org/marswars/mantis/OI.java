package org.marswars.mantis;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.marswars.mantis.commands.DumpDumper;
import org.marswars.mantis.commands.FlapWings;
import org.marswars.mantis.commands.LoadDumper;
import org.marswars.mantis.commands.ClimberExtend;
import org.marswars.mantis.commands.ClimberRetract;
import org.marswars.mantis.commands.WinchTiltBackward;
import org.marswars.mantis.commands.WinchTiltForward;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    public XboxController xbox;

    public OI() {
        xbox = new XboxController(RobotMap.xboxControllerPort);

        new JoystickButton(xbox, XboxController.ButtonType.kA.value).whileHeld(new LoadDumper());
        new JoystickButton(xbox, XboxController.ButtonType.kB.value).whileHeld(new DumpDumper());
        new JoystickButton(xbox, XboxController.ButtonType.kX.value).whileHeld(new FlapWings());
        new JoystickButton(xbox, XboxController.ButtonType.kLTrigger.value).whileHeld(new ClimberExtend());
        new JoystickButton(xbox, XboxController.ButtonType.kRTrigger.value).whileHeld(new ClimberRetract()); 
        new JoystickButton(xbox, XboxController.ButtonType.kL.value).whileHeld(new WinchTiltBackward());
        new JoystickButton(xbox, XboxController.ButtonType.kR.value).whileHeld(new WinchTiltForward());
    }
    
}
