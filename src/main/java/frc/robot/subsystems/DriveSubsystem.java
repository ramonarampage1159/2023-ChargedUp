// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class DriveSubsystem extends SubsystemBase {

  CANSparkMax m_leftMotor1 =  new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANSparkMax m_leftMotor2 =  new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
  private final MotorControllerGroup m_leftMotorGroup = new MotorControllerGroup(m_leftMotor1, m_leftMotor2);
   
  CANSparkMax m_rightMotor1 =  new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANSparkMax m_rightMotor2 =  new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
  private final MotorControllerGroup m_rightMotorGroup = new MotorControllerGroup(m_rightMotor1, m_rightMotor2);


  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {}

  @Override
  public void periodic() {

    // This method will be called once per scheduler run
    //SmartDashboard.putNumber("test", 1);
  }

  public void setMotors(double leftSpeed, double rightSpeed){
    m_leftMotor1.set(leftSpeed);
    m_leftMotor2.set(leftSpeed);
    // or --> m_leftMotorGroup.set(leftSpeed);
    m_rightMotor1.set(-rightSpeed);
    m_rightMotor2.set(-rightSpeed);

  }
}
