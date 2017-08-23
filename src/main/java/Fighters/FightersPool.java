package Fighters;

import java.util.List;

/**
 * Created by traitorwtf on 23.08.2017.
 */
public class FightersPool {
    private List<Fighter> fightersPool;

    public FightersPool(List<Fighter> fightersPool){
        this.fightersPool = fightersPool;
    }

    public void beginTournament(){
        for (Fighter fighter: fightersPool) {
            fighter.fight();
            System.out.println();
        }
    }

}
