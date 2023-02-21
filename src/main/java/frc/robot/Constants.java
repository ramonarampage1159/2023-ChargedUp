// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static class OperatorConstants {
    
  }

  public static class DriveConstants {    
    public static final int DRIVER_CONTROLLER = 0;
    public static final int LEFTSTICK_Y = 0;
    public static final int LEFTSTICK_X = 1;
    public static final int RIGHTSTICK_X = 2;
    public static final int DRIVETRAIN_LEFT_FRONT_CANSPARKMAX = 0;
    public static final int DRIVETRAIN_LEFT_REAR_CANSPARKMAX = 2;
    public static final int DRIVETRAIN_RIGHT_FRONT_CANSPARKMAX = 3;
    public static final int DRIVETRAIN_RIGHT_REAR_CANSPARKMAX = 4;

    public static final double LIMITER = 0.8;

  }
 
  public static class PistonClampConstants {
    public static final int PISTONCLAMP_CONTROLLER = 1;
    public static final int PISTONCLAMP_SOLENOID30FOWARD = 0;
    public static final int PISTONCLAMP_SOLENOID30REVERSE = 1;
    public static final int PISTONCLAMP_SOLENOID60FOWARD = 2;
    public static final int PISTONCLAMP_SOLENOID60REVERSE = 3;
  }
}
