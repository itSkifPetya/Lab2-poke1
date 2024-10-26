package move;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic(Type type, double pow, double acc) { super(type, pow, acc); }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "Psychic!";
    }
}