package GuiltyGearFighter;

import interfaces.Device;
import org.springframework.stereotype.Component;

/**
 * Created by traitorwtf on 22.08.2017.
 */
@Component(value = "ggDevice")
public class GuiltyDevice implements Device {
    public void useDevice() {
        System.out.println("Using stick");
    }
}
