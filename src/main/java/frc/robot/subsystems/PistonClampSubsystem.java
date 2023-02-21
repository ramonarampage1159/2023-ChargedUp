// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.PistonClampConstants;

public class PistonClampSubsystem extends SubsystemBase {

  DoubleSolenoid dblSolenoid30;
  DoubleSolenoid dblSolenoid60;


  /** Creates a new PistonClampSubsystem. */
  public PistonClampSubsystem() {

    dblSolenoid30 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, PistonClampConstants.PISTONCLAMP_SOLENOID30FOWARD, PistonClampConstants.PISTONCLAMP_SOLENOID30REVERSE);
    dblSolenoid60 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, PistonClampConstants.PISTONCLAMP_SOLENOID60FOWARD, PistonClampConstants.PISTONCLAMP_SOLENOID60REVERSE);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
