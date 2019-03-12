package io.github.bael.javacourse.knight;

import io.github.bael.javacourse.knight.chances.BadLuckChance;
import io.github.bael.javacourse.knight.warriors.BlackKnight;
import io.github.bael.javacourse.knight.warriors.Knight;
import io.github.bael.javacourse.knight.warriors.WarriorState;
import org.junit.Assert;
import org.junit.Test;

public class BlackKnightTest {

    /**
     * Мы должны проверить что рыцарь не теряет здоровья, если его защита равна наносимум урону
     */
    @Test
    public void testSolidDefence() {
        // подготавливаем данные для теста
        WarriorState blackKnightState = WarriorState.builder().attackLevel(100)
                .defenceLevel(300).hp(1000).maxHP(1000).strength(100).level(1).build();

        WarriorState whiteKnightState = WarriorState.builder().attackLevel(100)
                .defenceLevel(100).hp(1000).maxHP(1000).strength(100).level(1).build();

        Knight knight = new Knight(whiteKnightState);
        BlackKnight blackKnight = new BlackKnight(blackKnightState);

        BadLuckChance chance = new BadLuckChance();

        // совершаем действия которые мы хотим проверить
        knight.attackEnemy(chance, blackKnight);

        // проверяем что код выполняет условия спецификации\ теста
        Assert.assertEquals(1000, blackKnight.getState().getHP());


    }

}