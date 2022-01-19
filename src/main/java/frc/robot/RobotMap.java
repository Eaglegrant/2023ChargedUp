package frc.robot;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.Solenoid;

public interface RobotMap {

    public interface Drive {

     public final static int 
        FL_ID = 0,
        FR_ID = 1,
        BL_ID = 2,
        BR_ID = 3;

    public SerialPort.Port navXPort = SerialPort.Port.kUSB;

    }

    public interface KOI {

    
     public static final int
        HORIZONTAL_AXIS = 0,
        VERTICAL_AXIS = 1,
        ROTATIONAL_AXIS = 2,
        SLIDER_AXIS = 3;

    public static final int
        Trigger_Button = 1,
        Base_Top_Left_Button = 7,
        THUMB_BUTTON = 2;



     public static final int
        LEFT_JOYSTICK = 1, 
        RIGHT_JOYSTICK = 2,
        MANIP_JOYSTICK = 0;

    }

    public interface Intake {

        public static final int 
        Right_IntakeMotor_ID = 10,
        Left_IntakeMotor_ID = 14,
        Solenoid1 = 0,
        Solenoid2 = 1;
    }
}
