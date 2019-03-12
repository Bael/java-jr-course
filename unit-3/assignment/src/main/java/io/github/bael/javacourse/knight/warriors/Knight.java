package io.github.bael.javacourse.knight.warriors;

import io.github.bael.javacourse.knight.chances.Chance;

/**
 * Рыцарь. наносит урон черному рыцарю с удвоенной силой.
 */
public class Knight extends Warrior {

    private Knight() {
    }

    public Knight(ActorState state) {
        super(state);
    }


    public void attackEnemy(Chance chance, BlackKnight blackKnight) {

        System.out.println("Attacking the blackKnight with hatred!");

        boolean isCritical = detectCriticalAttackChance(chance.getProbability());

        Damage damage = new Damage(state.getAttackLevel() + 2 * state.getStrength(), isCritical);

        blackKnight.receiveAttack(damage);
    }
}
