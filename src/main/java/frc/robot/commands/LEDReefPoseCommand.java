package frc.robot.commands;
import edu.wpi.first.wpilibj.LEDPattern;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.LEDSubsystem;
import frc.robot.subsystems.swervedrive.SwerveSubsystem;
import swervelib.SwerveDrive;

public class LEDReefPoseCommand extends Command{

    SwerveSubsystem swerve;
    LEDSubsystem leds;
    public LEDReefPoseCommand(SwerveSubsystem swerv, LEDSubsystem leds){
            this.swerve=swerve;
            this.leds=leds;
    }
    @Override
    public void initialize()
    {
  
    }

    @Override
    public void execute(){
        if(swerve.getClosestReefSide()%2==0){
            leds.setPatternInstant(LEDPattern.solid(Color.kRed));
        }
        else{
            leds.setPatternInstant(LEDPattern.solid(Color.kRed));

        }
       
    }
    @Override
    public boolean isFinished(){
        return true;
    }
    @Override
    public void end(boolean interuppted){
        leds.setPatternInstant(LEDPattern.solid(Color.kOrange));

    }

}
