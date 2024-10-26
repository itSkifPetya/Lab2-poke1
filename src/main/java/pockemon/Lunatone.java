package pockemon;

import move.Bulldoze;
import move.CalmMind;
import move.Moonblast;
import move.RockPolish;
import ru.ifmo.se.pokemon.*;


public class Lunatone extends Pokemon {
    public int c = 0;

    public Lunatone(String name, int lvl) {
        super(name, lvl);
        setType(Type.ROCK, Type.PSYCHIC);
        setStats(90, 55, 65, 95, 85, 70);

        Bulldoze bulldoze = new Bulldoze(Type.GROUND, 60., 100.);
        CalmMind calmMind = new CalmMind();
        RockPolish rockPolish = new RockPolish();
        Moonblast moonblast = new Moonblast(Type.FAIRY, 95., 100.);
        setMove(bulldoze, calmMind, rockPolish, moonblast);
    }

}
