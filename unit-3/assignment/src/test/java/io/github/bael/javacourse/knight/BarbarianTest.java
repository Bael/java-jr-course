package io.github.bael.javacourse.knight;

import io.github.bael.javacourse.knight.chances.BadLuckChance;
import io.github.bael.javacourse.knight.warriors.Barbarian;
import io.github.bael.javacourse.knight.warriors.BlackKnight;
import io.github.bael.javacourse.knight.warriors.WarriorState;
import org.junit.Assert;
import org.junit.Test;

public class BarbarianTest {

    @Test
    public void attackEnemyNormal() {

        WarriorState.WarriorStateBuilder stateBuilder = WarriorState.builder().attackLevel(100)
                .defenceLevel(100).hp(1000).strength(100).level(1);

        WarriorState state = WarriorState.builder().attackLevel(100)
                .defenceLevel(100).hp(1000).strength(100).level(1).build();

        state.takeDamage(799);
        Barbarian konan = new Barbarian(state);
        BlackKnight blackKnight = new BlackKnight(stateBuilder.build());

        BadLuckChance chance = new BadLuckChance();
        konan.attackEnemy(chance, blackKnight);

        Assert.assertEquals(900, blackKnight.getState().getHP());


    }

    @Test
    public void attackEnemyInRage() {
        WarriorState state = WarriorState.builder().attackLevel(100)
                .defenceLevel(100).hp(1000).strength(100).level(1).build();
        state.takeDamage(800);

        WarriorState knightState = WarriorState.builder().attackLevel(100)
                .defenceLevel(100).hp(1000).strength(100).level(1).build();

        Barbarian konan = new Barbarian(state);
        BlackKnight blackKnight = new BlackKnight(knightState);

        BadLuckChance chance = new BadLuckChance();

        konan.attackEnemy(chance, blackKnight);
        Assert.assertEquals(500, blackKnight.getState().getHP());

        konan.attackEnemy(chance, blackKnight);
        Assert.assertEquals(0, blackKnight.getState().getHP());
        Assert.assertFalse(blackKnight.getState().isAlive());


    }
}