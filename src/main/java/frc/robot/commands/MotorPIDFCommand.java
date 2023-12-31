// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Motor;



public class MotorPIDFCommand extends CommandBase {

  private Motor motor;
  private double velocitySetpoint;
  
  /** Creates a new MotorPIDFCommand. */
  public MotorPIDFCommand(double velocity, Motor motor) 
  {
    // Use addRequirements() here to declare subsystem dependencies.
    this.velocitySetpoint = velocity;
    this.motor = motor; 
    addRequirements(motor);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() 
  {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {
     motor.setVelocity(velocitySetpoint);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) 
  {
    motor.forceMotorStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() 
  {
    return false;
  }
}
