package io.github.bael.javacourse.knight.warriors;

public interface ActorState {
    int getLevel();

    int getHP();

    int getMaxHP();

    double getHPState();

    int getStrength();

    int getAttackLevel();

    int getDefenceLevel();

    boolean isAlive();

    ActorState takeDamage(int damage);

}
