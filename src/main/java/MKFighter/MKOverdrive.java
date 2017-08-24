package MKFighter;

import interfaces.Overdrive;
import org.springframework.stereotype.Component;

/**
 * Created by traitorwtf on 22.08.2017.
 */
@Component(value = "mkOverdrive")
public class MKOverdrive implements Overdrive{
    public void useOverdrive() {
        System.out.println("Used Super");
    }
}
