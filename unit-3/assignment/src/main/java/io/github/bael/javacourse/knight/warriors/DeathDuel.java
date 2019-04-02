package io.github.bael.javacourse.knight.warriors;

import io.github.bael.javacourse.knight.chances.BadLuckChance;

import java.util.Optional;

public class DeathDuel<T extends Warrior, S extends Warrior> implements Duel<T, S> {

    private final T left;
    private final S right;

    public DeathDuel(T left, S right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public Optional<Actor> fight() {
        BadLuckChance chance = new BadLuckChance();
        while (left.getState().isAlive() && right.getState().isAlive()) {
            left.attackEnemy(chance, right);
            if (right.getState().isAlive()) {
                right.attackEnemy(chance, left);
            }
        }

        return Optional.ofNullable(left.getState().isAlive() ? left : right);
    }

    @Override
    public Actor getHealthestWarrior() {
        ActorState leftState = left.getState();
        ActorState rightState = right.getState();
        return (leftState.getHP() > rightState.getHP() ? left : right);
    }

    @Override
    public Actor getStrongestWarrior() {
        ActorState leftState = left.getState();
        ActorState rightState = right.getState();
        return (leftState.getStrength() > rightState.getStrength() ? left : right);
    }

    @Override
    public Actor getMaxDefencedWarrior() {
        ActorState leftState = left.getState();
        ActorState rightState = right.getState();
        return (leftState.getDefenceLevel() > rightState.getDefenceLevel() ? left : right);
    }
}
