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
  public static final class ArmConstants {
    public static final int kMotorPort = 4;

    public static final double kP = 0.0000000085428;

    // These are fake gains; in actuality these must be determined individually for each robot
    public static final double kSVolts = 0.90671;
    public static final double kCosVolts = -0.0054064;
    public static final double kVVoltSecondPerRad = 0.032771;
    public static final double kAVoltSecondSquaredPerRad = 0.000043234;

    public static final double kMaxVelocityRadPerSecond = 0.5;
    public static final double kMaxAccelerationRadPerSecSquared = 2;

    public static final int kEncoderPPR = 2048;
    public static final int kGearRatio = 6;
    
    public static final double kEncoderDistancePerPulse = 2.0 * Math.PI / kEncoderPPR / kGearRatio;

    // The offset of the arm from the horizontal in its neutral position,
    // measured from the horizontal
    public static final double kArmOffsetRads = 0;
  }

  public static final class AutoConstants {
    public static final double kAutoTimeoutSeconds = 12;
    public static final double kAutoShootTimeSeconds = 7;
  }

  public static final class OIConstants {
    public static final int kDriverControllerPort = 0;
  }
}
