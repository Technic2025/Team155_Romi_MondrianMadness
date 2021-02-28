// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Runs Mondrian Madness Autonomous
   * For linear distances, the robot starts slow, speeds up, and ultimately slows down again
   * This is to ensure not to slide or skid past destination
   * 
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
      new DriveDistance(.5, 4, drivetrain),//first segment
      new DriveDistance(.6, 7.5, drivetrain),
      new DriveDistance(.5, 4, drivetrain),
      new TurnDegrees(-.6, 73, drivetrain),//first turn
      new DriveDistance(.5, 5, drivetrain),//drive to yellow
      new DriveDistance(.6, 7.25, drivetrain),
      new DriveDistance(.5, 5.4, drivetrain),
      new TurnDegrees(-.6, 105.75, drivetrain),//yellow turn
      new DriveDistance(.5, 5, drivetrain),//drive through middle
      new DriveDistance(.7, 17.5, drivetrain),
      new DriveDistance(.5, 5, drivetrain),
      new TurnDegrees(.6, 103, drivetrain),//blue turn
      new DriveDistance(.5, 3.75, drivetrain),//drive off of blue
      new DriveDistance(.7, 9, drivetrain),
      new DriveDistance(.5, 4, drivetrain),
      new TurnDegrees(.6, 59, drivetrain),//turn toward end
      new DriveDistance(.7, 13.9, drivetrain));//final segment

  }
}
