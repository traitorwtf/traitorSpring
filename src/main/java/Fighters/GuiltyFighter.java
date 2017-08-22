package Fighters;

import interfaces.Device;
import interfaces.Game;
import interfaces.Overdrive;

/**
 * Created by traitorwtf on 22.08.2017.
 */
public class GuiltyFighter implements Overdrive, Game, Device {

    public void playGame() {
        System.out.println("Playing Guilty Gear");
    }

    public void useDevice() {
        System.out.println("Using stick");
    }

    public void useOverdrive() {
        System.out.println("Used Overdrive");
    }
}
