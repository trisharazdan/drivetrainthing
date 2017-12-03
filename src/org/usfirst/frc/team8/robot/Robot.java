package org.usfirst.frc.team8.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	   RobotDrive myRobot;
	     Joystick stick;
	     Timer timer;

	final String defaultAuto = "Default";
	final String customAuto = "My Auto";
	String autoSelected;
	SendableChooser<String> chooser = new SendableChooser<>();
	private Joystick drivestick;
	private Joystick turnstick;
	private Joystick slidestick;
	private Joystick climbstick;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		chooser.addDefault("Default Auto", defaultAuto);
		chooser.addObject("My Auto", customAuto);
		SmartDashboard.putData("Auto choices", chooser);
		
		drivestick = new Joystick(1);
		turnstick = new Joystick(2);
		slidestick = new Joystick(3);
		climbstick = new Joystick(4);
		
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the
	 * switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {
		autoSelected = chooser.getSelected();
		// autoSelected = SmartDashboard.getString("Auto Selector",
		// defaultAuto);
		System.out.println("Auto selected: " + autoSelected);
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		switch (autoSelected) {
		case customAuto:
			// Put custom auto code here
			break;
		case defaultAuto:
		default:
			// Put default auto code here
			break;
		}
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		
		    Object stick = null;
			Robot.arcadeDrive(stick); 

	    	double driveValue = -drivestick.getY();
		    double turnValue = turnstick.getX();
	         
			double leftSpeed = driveValue + turnValue;
			double rightSpeed = -(driveValue - turnValue);
			
			System.out.println(driveValue);
			System.out.println(turnValue);
			
			CANTalon left_1 = new CANTalon(1);
			CANTalon left_2 = new CANTalon(2);
			CANTalon left_3 = new CANTalon(3);
			CANTalon right_1 = new CANTalon(4);
			CANTalon right_2 = new CANTalon(5);
			CANTalon right_3 = new CANTalon(6);
			
			left_1.set((double) leftSpeed);
			left_2.set((double) leftSpeed);
			left_3.set((double) leftSpeed);
			right_1.set((double) rightSpeed);
			right_2.set((double) rightSpeed);
			right_3.set((double) rightSpeed); 
	   	  
			System.out.println (leftSpeed);
			System.out.println (rightSpeed);
	}

	private static void arcadeDrive(Object stick) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
	}
}

