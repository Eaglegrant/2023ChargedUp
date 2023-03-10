// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Intake.Auto;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake.Intake;

public class Autointake extends CommandBase {
    /** Creates a new Autointake. */
    double time;
    Timer timer;
    Intake intake;
    boolean isFinished = false;

    public Autointake(Intake subsystem, double m_time) {
        // Use addRequirements() here to declare subsystem dependencies.
        time = m_time;
        intake = subsystem;
        addRequirements(subsystem);

    }

    // Use addRequirements() here to declare subsystem dependencies.

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        timer.start();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
//Must be redone so that TWO motors turn.
        while (timer.get() < time) {
            intake.IntakeMotor1.set(.8); //another line of this
                        intake.IntakeMotor2.set(.8);
        }
        intake.IntakeMotor1.set(0);
        intake.IntakeMotor2.set(0);

        isFinished = true;


    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        timer.stop();
        timer.reset();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return isFinished;
    }
}