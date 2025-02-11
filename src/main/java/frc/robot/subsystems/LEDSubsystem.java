package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.LEDPattern;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LEDSubsystem extends SubsystemBase{

    public AddressableLED leds;
    public AddressableLEDBuffer buffer;


    public LEDSubsystem(){
        leds = new AddressableLED(0);
        buffer = new AddressableLEDBuffer(20);

        leds.setLength(buffer.getLength());
        leds.setData(buffer);
        leds.start();
        


    }



    @Override
    public void periodic(){
        leds.setData(buffer);
    }

    public Command setPattern(LEDPattern pattern){
        return this.run(()->{
            pattern.applyTo(buffer);
        });
    }
    public void setPatternInstant(LEDPattern pattern){
            pattern.applyTo(buffer);
    }
    
}
