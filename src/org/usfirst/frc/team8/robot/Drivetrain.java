package org.usfirst.frc.team8.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;

public class Drivetrain{
	
	Joystick drivestick = new Joystick(1);
	Joystick turnstick = new Joystick(2);

	CANTalon left_1 = new CANTalon(1);
	CANTalon left_2 = new CANTalon(2);
	CANTalon left_3 = new CANTalon(3);
	CANTalon right_1 = new CANTalon(4);
	CANTalon right_2 = new CANTalon(5);
	CANTalon right_3 = new CANTalon(6);
	 
	public void driveValues() {
		
		
		double driveValue = -drivestick.getY();
	    double turnValue = turnstick.getX();
         
		double leftSpeed = driveValue + turnValue;
		double rightSpeed = -(driveValue - turnValue);
		
		System.out.println ("Drive Value : " + driveValue);
		System.out.println ("Turn Value : " + turnValue);
		
		left_1.set((double) leftSpeed);
		left_2.set((double) leftSpeed);
		left_3.set((double) leftSpeed);
		right_1.set((double) rightSpeed);
		right_2.set((double) rightSpeed);
		right_3.set((double) rightSpeed); 
   	  
		System.out.println ("Left Speed : " + leftSpeed);
		System.out.println ("Right Speed : " + rightSpeed);
	}
}