// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.util.Arrays;
import java.util.List;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.util.Units;
import swervelib.math.Matter;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean constants. This
 * class should not be used for any other purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants
{

  public static final double ROBOT_MASS = (148 - 20.3) * 0.453592; // 32lbs * kg per pound
  public static final Matter CHASSIS    = new Matter(new Translation3d(0, 0, Units.inchesToMeters(8)), ROBOT_MASS);
  public static final double LOOP_TIME  = 0.13; //s, 20ms + 110ms sprk max velocity lag
  public static final double MAX_SPEED  = Units.feetToMeters(14.5);
  // Maximum speed of the robot in meters per second, used to limit acceleration.

//  public static final class AutonConstants
//  {
//
//    public static final PIDConstants TRANSLATION_PID = new PIDConstants(0.7, 0, 0);
//    public static final PIDConstants ANGLE_PID       = new PIDConstants(0.4, 0, 0.01);
//  }

  public static final class DrivebaseConstants
  {

    // Hold time on motor brakes when disabled
    public static final double WHEEL_LOCK_TIME = 10; // seconds
    public static final double kPX = 3, kIX = .25;
    public static final double kPY = 3, kIY = .25;
    public static final double kPTheta = 4, kIThetwa = .3;
    public static final double kS = .010838;
    public static final double kV = 2.3209;
    public static final double kA = .28083;
    public static final double DRIVE_RADIUS = .79026; //inches
    public static final double TOLERANCE = 0;
  }

  public static class OperatorConstants
  {

    // Joystick Deadband
    public static final double DEADBAND        = 0.1;
    public static final double LEFT_Y_DEADBAND = 0.1;
    public static final double RIGHT_X_DEADBAND = 0.1;
    public static final double TURN_CONSTANT    = 6;
  }

  public static class FieldPositions
  { 
    public static final Translation2d BLUE_REEF_CENTER = new Translation2d(4.5, 4);
    public static final Translation2d RED_REEF_CENTER = new Translation2d(13, 4);


    public static final Pose2d BLUE_LEFT_CORAL_STATION_PICKUP = new Pose2d(new Translation2d(1.2, 7.0), Rotation2d.fromDegrees(120));


    public static final Pose2d TAG_18_DEPOSIT_LEFT = new Pose2d(new Translation2d(3.2, 4.2), Rotation2d.fromDegrees(90));
    public static final Pose2d TAG_18_DEPOSIT_RIGHT = new Pose2d(new Translation2d(3.2, 3.8), Rotation2d.fromDegrees(90));

    public static final Pose2d TAG_19_DEPOSIT_RIGHT = new Pose2d(new Translation2d(3.3, 4.87), Rotation2d.fromDegrees(30));
    public static final Pose2d TAG_19_DEPOSIT_LEFT = new Pose2d(new Translation2d(3.7, 5.1), Rotation2d.fromDegrees(30));

    public static final Pose2d TAG_20_DEPOSIT_LEFT = new Pose2d(new Translation2d(5.3, 5), Rotation2d.fromDegrees(-30));
    public static final Pose2d TAG_20_DEPOSIT_RIGHT = new Pose2d(new Translation2d(5.0, 5.2), Rotation2d.fromDegrees(-30));
    
    public static final List<Pose2d> kReefPositions = Arrays.asList(TAG_18_DEPOSIT_LEFT, TAG_18_DEPOSIT_RIGHT, TAG_19_DEPOSIT_LEFT, TAG_19_DEPOSIT_RIGHT, TAG_20_DEPOSIT_LEFT, TAG_20_DEPOSIT_RIGHT);

    public static boolean isReef(int id) {
      return id==7 || id ==8 || id ==9 || id ==10 || id ==11 || id ==17 || id==18 || id==19 || id==20 || id ==21 || id==22;
    }
  }
}
