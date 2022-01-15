package frc.robot.commands.Drive;

import frc.robot.subsystems.Drive.Drive;

public class angleDrive {
    public Drive drive;
    public double porOut, lastOut, iOut, iTop, iBottom, desired, error, kp, kI;

  /*  public double pidCalculations() {
        iTop = desired * 1;
        iBottom = desired - (desired * 1);
        porOut = error * kp;
        iOut = error * kI;

        if (porOut > iBottom && porOut < iTop){
            return porOut + iOut;
        }
        else {
        return porOut;
        }
    }
*/
public angleDrive(Drive subsystem, double _angleDesired) {
    iTop = desired * 1;
    iBottom = desired - (desired * 1);
    porOut = error * kp;
    iOut = error * kI;
    desired = _angleDesired;
    drive = subsystem;
    addRequirements(drive);
    
    }
public void initialize() {
    iTop = 0;
    iBottom = 0;
    porOut = 0;
    iOut = 0;
    desired = 0;
}
public void execute() {
    error = Drive.navx.getYaw() - desired;
    if (error < -180)
    error += 360;
else if (error > 180) 
    error -= 360;

    error = error/90;
    iTop = desired * 1;
    iBottom = desired - (desired * 1);
    porOut = error * kp;
    iOut = error * kI;
    if (limit(outputs(), .40, -.40) <.07 && limit(outputs(), .40, -.40) > 0) {
        porOut = .07;
            }
            else if (limit(outputs(), .40, -.40) > -.07 && limit(outputs(), .40, -.40) < 0) {
                porOut= -.07;
            }
        }

double outputs(){
    if (porOut > iBottom && porOut < iTop){
        return porOut + iOut;
    }
    else {
    return porOut;
    }
}
    
    public static double limit(double x, double upperLimit, double lowerLimit) {
        if (x >= upperLimit) {
            x = upperLimit;
        } else if (x <= lowerLimit) {
            x = lowerLimit;
        }
        return x;
    }

private void addRequirements(Drive drive2) {
}
}
