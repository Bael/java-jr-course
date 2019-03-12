package io.github.bael.javacourse.knight.warriors;

import io.github.bael.javacourse.knight.chances.Chance;

/**
 * Варвар. при низком здоровье (20 %) сила умножается на 5.
 */
public class Barbarian extends Warrior {

    private static final double RAGE_HEALTH_EDGE = .2d;

    private Barbarian() {
    }

    public Barbarian(ActorState state) {
        super(state);
    }

    /**
     * При пониженном здоровье урон от силы в пять раз выше
     */
    @Override
    public void attackEnemy(Chance chance, Warrior warrior) {

    }

}
