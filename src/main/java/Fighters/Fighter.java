package Fighters;

import interfaces.Device;
import interfaces.Game;
import interfaces.Overdrive;

/**
 * Created by traitorwtf on 22.08.2017.
 */
public class Fighter {
    private String name;
    private int age;
    private boolean pro;

    private Device device;
    private Game game;
    private Overdrive overdrive;

    public Fighter() {
    }

    public Fighter(Device device, Game game, Overdrive overdrive) {
        this.device = device;
        this.game = game;
        this.overdrive = overdrive;
    }

    public Fighter(String name, int age, boolean pro) {
        this.name = name;
        this.age = age;
        this.pro = pro;
    }

    public Fighter(String name, int age, boolean pro, Device device, Game game, Overdrive overdrive) {
        this.name = name;
        this.age = age;
        this.pro = pro;
        this.device = device;
        this.game = game;
        this.overdrive = overdrive;
    }

    public void fight(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Pro: " + this.pro);
        if (game != null) {
            game.playGame();
        }
        if (device != null){
            device.useDevice();
        }

        if (overdrive != null){
            overdrive.useOverdrive();
        }

    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Overdrive getOverdrive() {
        return overdrive;
    }

    public void setOverdrive(Overdrive overdrive) {
        this.overdrive = overdrive;
    }
}
