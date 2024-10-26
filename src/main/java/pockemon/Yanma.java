package pockemon;

import move.BugBuzz;
import move.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Yanma extends Pokemon {
    public Yanma(String name, int lvl) {
        super(name, lvl);
        setType(Type.BUG, Type.FLYING);
        setStats(65, 65, 45, 75,45,95);

        Psychic psychic = new Psychic(Type.PSYCHIC, 90, 100);
        BugBuzz bugBuzz = new BugBuzz(Type.BUG, 90, 100);
        AirSlash airSlash = new AirSlash();
        setMove(psychic, bugBuzz, airSlash);

    }
}