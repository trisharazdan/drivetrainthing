package org.usfirst.frc.team8.robot;
import com.ctre.MotorControl.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

public class Drivetrain{
	//Imports the other files needed by the program
	


	//Defines the variables as members of our Robot class
	     RobotDrive myRobot;
	     Joystick stick;
	     Timer timer;


	//Initializes the variables in the robotInit method, this method is called when the robot is initializing
	     public void robotInit() {
	    	 
	     }
	     
	      RobotDrive myDrive = new RobotDrive(1, 2, 3, 4);
	      Joystick drivestick = new Joystick(1);
	      Joystick turnstick = new Joystick(2);
	      Joystick slidestick = new Joystick(3);
	      Joystick climbstick = new Joystick(4);
	      
	      CANTalon left_1 = new CANTalon(1);
	   	  CANTalon left_2 = new CANTalon(2);
	   	  CANTalon left_3 = new CANTalon(3);
	   	  CANTalon right_1 = new CANTalon(4);
	   	  CANTalon right_2 = new CANTalon(5);
	   	  CANTalon right_3 = new CANTalon(6);   
	   	  
	     public void teleopInit() {
	     
	     }
	     
	     public void teleopPeriodic() {
	//TODO: change forward joystick values to negative    	 
		  
	    	 	double driveValue = drivestick.getY();
		    	double turnValue = turnstick.getX();
	         
			double leftSpeed = drivestick.;
			double rightSpeed = -1;
			
			left_1.set((double) leftSpeed);
			left_2.set((double) leftSpeed);
			left_3.set((double) leftSpeed);
			right_1.set((double) rightSpeed);
			right_2.set((double) rightSpeed);
			right_3.set((double) rightSpeed);
			
			
	     }
	     
	     public void autonomusInit() {
	
	     }
	     
	     public void autonomousPeriodic() {
	    	
	     }
	     
	     public void disabledInit() {
	    	 disable();
	     }
	     
	     private void disable() {
			// TODO Auto-generated method stub
			
		}
	     
		public void disabledPeriodic () {
			
		}
}