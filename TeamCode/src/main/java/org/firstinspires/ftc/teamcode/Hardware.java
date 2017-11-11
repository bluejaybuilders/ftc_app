package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cColorSensor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by bluej on 11/10/2017.
 */

public class Hardware {
    public DcMotor frontLeft;
    public DcMotor frontRight;
    public DcMotor backLeft;
    public DcMotor backRight;

    public ModernRoboticsI2cColorSensor colorSensor;
    public Servo servo;

    public void init(HardwareMap ahwMap, boolean usingEncoders) {
        frontLeft = ahwMap.dcMotor.get("frontLeft");
        frontRight = ahwMap.dcMotor.get("frontRight");
        backLeft = ahwMap.dcMotor.get("backLeft");
        backRight = ahwMap.dcMotor.get("backRight");

        colorSensor = (ModernRoboticsI2cColorSensor) ahwMap.colorSensor.get("jewelmission");
        servo = ahwMap.servo.get("jewelAttachment");

        if (!usingEncoders) {
            frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        } else {
            frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }
    }
}