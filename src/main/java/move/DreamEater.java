package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public final class DreamEater extends SpecialMove {
    public DreamEater(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (pokemon.getCondition() == Status.SLEEP) {
            super.applyOppDamage(pokemon, v);
        } else {
            super.applyOppDamage(pokemon, 0);
        }
    }



    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

}
