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


    /***
     * Удваиваем урон если противник черный рыцарь.
     * @param chance шанс критического удара
     * @param blackKnight тип противника - черный рыцарь
     */
    public void attackEnemy(Chance chance, BlackKnight blackKnight) {

       
    }
}
