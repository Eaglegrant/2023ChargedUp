
package frc.robot;

import edu.wpi.first.wpilibj.SerialPort;

public interface RobotMap {

    public interface Drive {
     public final static int 
        FL_ID = 0,
        FR_ID = 1,
        BL_ID = 2,
        BR_ID = 3;

     public SerialPort.Port navXPort = SerialPort.Port.kUSB;

    }
    public interface Hang {
        public final static int
            V1_ID = 4,
            V2_ID = 5,
            H1_ID = 6,
            H2_ID = 7,
            S1_ID= 8,
            S2_ID = 9;
    }
    public interface Intake { 
     public final static int 
        LI_ID = 10,
        RI_ID = 11,
        S1_ID = 12,
        S2_ID = 13,
        S3_ID = 14,
        S4_ID = 15;
    }

    public interface Turret{
     public final static int
        PL_ID = 20,
        PR_ID = 21,
        R_ID = 22, //rotate ID
        HA_ID = 23; //Hood Angle
    }   

    public interface KOI {
     public static final int
        HORIZONTAL_AXIS = 0,
        VERTICAL_AXIS = 1,
        ROTATIONAL_AXIS = 2,
        SLIDER_AXIS = 3;



     public static final int
        LEFT_JOYSTICK = 1, 
        RIGHT_JOYSTICK = 2,
        MANIP_JOYSTICK = 0;
        
     public static final int
         Trigger_Button = 1,
         THUMB_BUTTON = 2,
        HANDLE_BUTTON1 = 3,
        HANDLE_BUTTON2 = 4,
        Base_Top_Left_Button = 7,
        BUTTON7 = 8,
        Button8 = 10,
        Button9 = 11,
        Button10 = 12,
        Button11 = 13;
    }
}