package io.github.bael.javacourse.knight.warriors;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeathDuelTest {

    @Test
    public void testDuel() {

       // ArrayList
        //Map
        //BiFunction


        WarriorState.WarriorStateBuilder stateBuilder = WarriorState.builder().attackLevel(100)
                                                                    .defenceLevel(100).hp(1001).maxHP(1001).strength(100).level(1);
        WarriorState state = WarriorState.builder().attackLevel(100)
                                         .defenceLevel(100).hp(1000 - 799).maxHP(1000).strength(100).level(1).build();

        Barbarian conan = new Barbarian(state);
        BlackKnight blackKnight = new BlackKnight(stateBuilder.build());
        Knight paladin = new Knight(stateBuilder.build());

        //DeathDuel<Barbarian, BlackKnight> duel = new DeathDuel<>(blackKnight, conan); //(does not compiles)

        DeathDuel<Barbarian, BlackKnight> duel = new DeathDuel<>(conan, blackKnight);
        Optional<Actor> winnerOptional = duel.fight();
        Actor winner = winnerOptional.orElse(paladin);

        assertEquals(conan, winner);

    }
}