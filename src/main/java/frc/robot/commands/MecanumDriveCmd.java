// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveSubsystem;

public class MecanumDriveCmd extends CommandBase {
  /** Creates a new MecanumDriveCmd. */
  public MecanumDriveCmd(DriveSubsystem driveSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.

    addRequirements(driveSubsystem); 
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    /* 
    double leftStickX = -(Robot.m_robotContainer.GetDriverRawAxis(Constants.DriveConstants.LEFTSTICK_X)) * (Constants.DriveConstants.LIMITER);
    double leftStickY = (Robot.m_robotContainer.GetDriverRawAxis(Constants.DriveConstants.LEFTSTICK_Y)) * (Constants.DriveConstants.LIMITER);
    double leftStickZ = (Robot.m_robotContainer.GetDriverRawAxis(Constants.DriveConstants.RIGHTSTICK_X)) * (Constants.DriveConstants.LIMITER);
    */
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
