package pockemon;

import move.DreamEater;
import move.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon {
    public Cleffa(String name, int lvl) {
        super(name, lvl);

        setType(Type.FAIRY);
        setStats(50, 25, 28, 45, 55, 15);

        ThunderWave thunderWave = new ThunderWave();
        DreamEater dreamEater = new DreamEater(Type.PSYCHIC, 100, 100);
        setMove(thunderWave, dreamEater);
    }
}
