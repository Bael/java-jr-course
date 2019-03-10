package io.github.bael.javacourse.knight.items;

import io.github.bael.javacourse.knight.chances.Chance;
import io.github.bael.javacourse.knight.warriors.Damage;

public interface Armor extends MaterialItem {
    Damage takeDamage(Damage attackDamage, Chance chance);
}
