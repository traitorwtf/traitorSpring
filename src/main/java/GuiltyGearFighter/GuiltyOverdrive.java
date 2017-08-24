package GuiltyGearFighter;

import interfaces.Overdrive;
import org.springframework.stereotype.Component;

/**
 * Created by traitorwtf on 22.08.2017.
 */
@Component(value = "ggOverdrive")
public class GuiltyOverdrive implements Overdrive{
    public void useOverdrive() {
        System.out.println("Used Overdrive");
    }
}
