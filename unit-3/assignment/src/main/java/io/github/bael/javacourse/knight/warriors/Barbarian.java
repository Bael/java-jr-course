package io.github.bael.javacourse.knight.warriors;

import io.github.bael.javacourse.knight.chances.Chance;

/**
 * Варвар. при низком здоровье (20 %) сила умножается на 5.
 */
public class Barbarian implements Actor {

    private static final double RAGE_HEALTH_EDGE = .2d;

    private Barbarian() {
    }

    public Barbarian(ActorState state) {
    }


    @Override
    public void attackEnemy(Chance chance, Actor warrior) {

    }

    @Override
    public void receiveAttack(Damage strike) {

    }

    @Override
    public ActorState getState() {
        return null;
    }
}
