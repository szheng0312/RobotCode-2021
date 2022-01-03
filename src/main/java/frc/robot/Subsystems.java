package subsystems;

public class Drive {
    private int right = 0;
    private int right2 = 1;
    private int left = 0;
    private int left2 = 1;

    private TalonFX rightMotor  = new TalonFX(right);
    private TalonFX rightMotor2  = new TalonFX(right2);
    private TalonFX leftMotor  = new TalonFX(left);
    private TalonFX leftMotor2  = new TalonFX(left2);

    rightMotor2.set(ControlMode.Follower, right);
    leftMotor2.set(ControlMode.Follower, left);

    public void setOpenLoop(double throttle, double turn){
        rightMotor.set(ControlMode.PercentOutput, throttle + turn);
        leftMotor.set(ControlMode.PercentOutput, throttle - turn);
    }
    public void stop(){
        rightMotor.setNeutralMode(NeutralMode.Brake);
        leftMotor.setNeutralMode(NeutralMode.Brake);
    }


}
