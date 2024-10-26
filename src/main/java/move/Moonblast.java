package move;

import ru.ifmo.se.pokemon.*;

public class Moonblast extends SpecialMove {
    public Moonblast(Type type, double pow, double acc) { super(type, pow, acc); }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect e = new Effect().chance(0.3).stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "Moonblast!";
    }
}
