package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.PIDCoefficients;

public class PIDController {
    DcMotor motor;
    double p, i, d;
    //setPoint is intentionally typed to be nullable.
    //that way we can easily define the "no setpoint yet" state
    Double setPoint;
    PIDPath runPath;

    public PIDController(DcMotor motor) {
        this.motor = motor;
        //todo: set some default p, i, d values
    }

    public PIDCoefficients getPID(){
        return new PIDCoefficients(p, i, d);
    }

    public void setP(double p){
        this.p = p;
        //todo: stop path execution, generate new path
    }

    public void setI(double i){
        this.i = i;
        //todo: stop path execution, generate new path
    }

    public void setD(double d){
        this.d = d;
        //todo: stop path execution, generate new path
    }

    public void setPID(PIDCoefficients pid){
        p = pid.p;
        i = pid.i;
        d = pid.d;
        //todo: stop path execution, generate new path
    }

    public Double getTargetPosition(){
        return setPoint;
    }

    public void setTargetPosition(Double pos) {
        setPoint = pos;
        //todo: stop path execution, generate new path
    }
}
