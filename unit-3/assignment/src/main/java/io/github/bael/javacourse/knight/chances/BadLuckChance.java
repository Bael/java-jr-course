package io.github.bael.javacourse.knight.chances;

/**
 * класс для тестирования, шанс всегда = 0
 */
public class BadLuckChance implements Chance {
    @Override
    public int getProbability() {
        return 0;
    }
}
