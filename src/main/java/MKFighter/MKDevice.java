package MKFighter;

import interfaces.Device;
import org.springframework.stereotype.Component;

/**
 * Created by traitorwtf on 22.08.2017.
 */
@Component(value = "mkDevice")
public class MKDevice implements Device {
    public void useDevice() {
        System.out.println("Using pad");
    }
}
