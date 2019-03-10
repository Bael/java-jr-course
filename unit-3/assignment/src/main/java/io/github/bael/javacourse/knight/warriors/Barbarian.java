package io.github.bael.javacourse.knight.warriors;

import io.github.bael.javacourse.knight.chances.Chance;

/**
 * Варвар. при низком здоровье (20 %) сила умножается на 5.
 */
public class Barbarian extends Warrior {

    private static final double RAGE_HEALTH_EDGE = .2d;

    private Barbarian() {
    }

    public Barbarian(WarriorState state) {
        super(state);
    }

    @Override
    public void attackEnemy(Chance chance, Warrior warrior) {
        int multiplication = 1;
        // здоровье меньше 20%
        if (state.getHPState() <= RAGE_HEALTH_EDGE) {
            System.out.println("Proud barbarian is in rage! Health is " + state.getHPState());
            multiplication = 5;
        }

        int percent = chance.getProbability();
        Damage damage = new Damage(state.getAttackLevel() + multiplication * state.getStrength(), detectCriticalAttackChance(percent));
        System.out.printf("Attack damage is %s.\n", damage);
        warrior.receiveAttack(damage);
    }

}
