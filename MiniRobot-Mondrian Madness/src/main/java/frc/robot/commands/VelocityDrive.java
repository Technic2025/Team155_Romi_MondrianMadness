/*
package frc.robot.commands;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.controller.SimpleMotorFeedforward;


public class VelocityDrive {
    private SimpleMotorFeedforward leftFeedforward = new SimpleMotorFeedforward(DRIVETRAIN_KS,DRIVETRAIN_KV,DRIVETRAIN_KA);
    private SimpleMotorFeedforward rightFeedforward = new SimpleMotorFeedforward(DRIVETRAIN_KS,DRIVETRAIN_KV,DRIVETRAIN_KA);
    private PIDController lPidController = new PIDController(DRIVETRAIN_VEL_KP, DRIVETRAIN_VEL_KI, DRIVETRAIN_VEL_KD);
    private PIDController rPidController = new PIDController(DRIVETRAIN_VEL_KP, DRIVETRAIN_VEL_KI, DRIVETRAIN_VEL_KD);
    

    public void velocityDrive(double lSpeed, double rSpeed){
    
        double lpid = lPidController.calculate(-getLeftVelocity(),lSpeed);
        double lffd = leftFeedforward.calculate(-getLeftVelocity());
        double rpid = rPidController.calculate(getRightVelocity(),rSpeed);
        double rffd = rightFeedforward.calculate(getRightVelocity());

        tankDrive(-(lpid + lffd), -(rpid + rffd));
  }
}
*/