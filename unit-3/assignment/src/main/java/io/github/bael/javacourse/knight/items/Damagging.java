package io.github.bael.javacourse.knight.items;

import io.github.bael.javacourse.knight.chances.Chance;
import io.github.bael.javacourse.knight.warriors.Damage;
import io.github.bael.javacourse.knight.warriors.DamageRange;

public interface Damagging {
    DamageRange getDamageRange();

    Damage Strike(Chance chance);


}
