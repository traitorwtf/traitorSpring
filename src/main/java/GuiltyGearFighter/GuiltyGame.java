package GuiltyGearFighter;

import interfaces.Game;
import org.springframework.stereotype.Component;

/**
 * Created by traitorwtf on 22.08.2017.
 */
@Component(value = "ggGame")
public class GuiltyGame implements Game {
    public void playGame() {
        System.out.println("Playing Guilty Gear");
    }
}
