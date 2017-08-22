package Fighters;

import interfaces.Device;
import interfaces.Game;
import interfaces.Overdrive;

/**
 * Created by traitorwtf on 22.08.2017.
 */
public class SfFighter implements Overdrive, Game, Device {

    public void playGame() {
        System.out.println("Playing Street Fighters.Fighter 5");
    }

    public void useDevice() {
        System.out.println("Using pad");
    }

    public void useOverdrive() {
        System.out.println("Used Ultra");
    }
}
