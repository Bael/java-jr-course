package io.github.bael.javacourse.knight.warriors;

import io.github.bael.javacourse.knight.chances.Chance;

/**
 * Рыцарь. наносит урон черному рыцарю с удвоенной силой.
 */
public class Knight implements Actor {

    private Knight() {
    }

    public Knight(ActorState state) {
    }


    /***
     * Удваиваем урон если противник черный рыцарь.
     * @param chance шанс критического удара
     * @param blackKnight тип противника - черный рыцарь
     */
    public void attackEnemy(Chance chance, BlackKnight blackKnight) {


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
