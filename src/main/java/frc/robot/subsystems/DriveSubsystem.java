// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants.DriveConstants;
//import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class DriveSubsystem extends SubsystemBase {

  /* Tank Drive
  CANSparkMax m_leftMotor1 =  new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANSparkMax m_leftMotor2 =  new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
  private final MotorControllerGroup m_leftMotorGroup = new MotorControllerGroup(m_leftMotor1, m_leftMotor2);   
  CANSparkMax m_rightMotor1 =  new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANSparkMax m_rightMotor2 =  new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
  private final MotorControllerGroup m_rightMotorGroup = new MotorControllerGroup(m_rightMotor1, m_rightMotor2);
  */
    
  //Mecanum Drive
  CANSparkMax m_leftFront = new CANSparkMax(DriveConstants.DRIVETRAIN_LEFT_FRONT_CANSPARKMAX, MotorType.kBrushless);
  CANSparkMax m_leftRear = new CANSparkMax(DriveConstants.DRIVETRAIN_LEFT_REAR_CANSPARKMAX, MotorType.kBrushless);
  CANSparkMax m_rightFront = new CANSparkMax(DriveConstants.DRIVETRAIN_RIGHT_FRONT_CANSPARKMAX, MotorType.kBrushless);
  CANSparkMax  m_rightRear = new CANSparkMax(DriveConstants.DRIVETRAIN_RIGHT_REAR_CANSPARKMAX, MotorType.kBrushless);

  private final MecanumDrive m_mecanumDrive =
    new MecanumDrive(m_leftFront, m_leftRear, m_rightFront, m_rightRear);


  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    
   //setDefaultCommand(new MecanumDriver());
   m_rightRear.setInverted(true);
   m_leftFront.setInverted(true);
  }

  @Override
  public void periodic() {

    // This method will be called once per scheduler run
    //SmartDashboard.putNumber("test", 1);
  }
  
  public void setMotorSpeed(double xAxis, double yAxis, double zAxis) {
    m_mecanumDrive.driveCartesian(xAxis, yAxis, zAxis);
  }


  //for Arcade Drive 
  public void setMotors(double leftSpeed, double rightSpeed){
    m_leftFront.set(leftSpeed);
    m_leftRear.set(leftSpeed);
    // or --> m_leftMotorGroup.set(leftSpeed);
    m_rightFront.set(-rightSpeed);
    m_rightRear.set(-rightSpeed);

  }
}
