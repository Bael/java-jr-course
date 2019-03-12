package io.github.bael.javacourse.knight;

import io.github.bael.javacourse.knight.warriors.ActorState;
import io.github.bael.javacourse.knight.warriors.WarriorState;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class WarriorStateTest {

    @Test
    public void takeDamageAndStayAlive() {
        WarriorState state =
                WarriorState.builder()
                        .attackLevel(100)
                        .defenceLevel(100)
                        .hp(1000)
                        .maxHP(1000)
                        .strength(100)
                        .level(1).build();
        Assert.assertTrue(state.isAlive());

        ActorState damagedState = state.takeDamage(999);
        Assert.assertTrue(damagedState.isAlive());

        ActorState heavilyDamagedState = damagedState.takeDamage(1);
        Assert.assertFalse(heavilyDamagedState.isAlive());
        heavilyDamagedState.takeDamage(1000);

        Assert.assertEquals(0, heavilyDamagedState.getHP());

        // отрицательный урон не должен лечить
        ActorState moreHeavilyDamagedState = heavilyDamagedState.takeDamage(-1);
        Assert.assertFalse(moreHeavilyDamagedState.isAlive());
        Assert.assertEquals(0, moreHeavilyDamagedState.getHP());

    }


    @Test
    public void builderTest() {
        WarriorState.WarriorStateBuilder builder =
                WarriorState.builder()
                        .attackLevel(101)
                        .defenceLevel(102)
                        .hp(1000)
                        .maxHP(1000)
                        .strength(103)
                        .level(1);
        WarriorState state = builder.build();

        assertEquals(101, state.getAttackLevel());
        assertEquals(102, state.getDefenceLevel());
        assertEquals(1000, state.getHP());
        assertEquals(103, state.getStrength());
        assertEquals(1, state.getLevel());

        WarriorState state2 = builder.build();
        assertNotSame(state, state2);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testPositiveStats() {
        WarriorState.WarriorStateBuilder builder =
                WarriorState.builder()
                        .attackLevel(-1)
                        .defenceLevel(-1)
                        .hp(-1)
                        .strength(-1)
                        .level(-1);
        builder.build();
    }


}