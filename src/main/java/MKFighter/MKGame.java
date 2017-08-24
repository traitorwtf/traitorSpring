package MKFighter;

import interfaces.Game;
import org.springframework.stereotype.Component;

/**
 * Created by traitorwtf on 22.08.2017.
 */
@Component(value = "mkGame")
public class MKGame implements Game {
    public void playGame() {
        System.out.println("Playing Mortal Kombat");
    }
}
