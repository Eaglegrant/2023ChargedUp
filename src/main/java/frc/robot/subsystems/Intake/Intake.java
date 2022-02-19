// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Intake;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Intake extends SubsystemBase {

    /** Creates a new Intake. */
    public DoubleSolenoid Solenoid1;

    public CANSparkMax Feeder;
    public CANSparkMax IntakeMotor;

    public Intake() {

        Feeder = new CANSparkMax(RobotMap.Intake.FM_ID, MotorType.kBrushless);
        IntakeMotor = new CANSparkMax(RobotMap.Intake.InM_ID, MotorType.kBrushless);
        Solenoid1 = new DoubleSolenoid(2, PneumaticsModuleType.REVPH, RobotMap.Intake.So1_ID, RobotMap.Intake.So2_ID);
    }

    @Override
    public void periodic() {}
    // This method will be called once per scheduler run
}