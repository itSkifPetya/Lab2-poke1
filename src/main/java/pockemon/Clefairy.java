package pockemon;

import move.Moonblast;
import ru.ifmo.se.pokemon.Type;

public class Clefairy extends Cleffa {
    public Clefairy(String name, int lvl) {
        super(name, lvl);
        setStats(70, 45,48, 60, 65, 35);

        Moonblast moonblast = new Moonblast(Type.FAIRY, 95., 100.); // DONE
        addMove(moonblast);
    }


}
