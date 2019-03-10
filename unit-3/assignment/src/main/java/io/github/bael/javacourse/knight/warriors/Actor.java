package io.github.bael.javacourse.knight.warriors;

import io.github.bael.javacourse.knight.chances.Chance;

public interface Actor {


    void attackEnemy(Chance chance, Warrior warrior);

    void receiveAttack(Damage strike);

    ActorState getState();


}
