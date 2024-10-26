package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class CalmMind extends StatusMove {

    public CalmMind() {}

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.ATTACK, +1);
        p.setMod(Stat.DEFENSE, +1);
    }

    @Override
    protected String describe() {
        return "Calm Mind!";
    }
}
