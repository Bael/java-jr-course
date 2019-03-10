package io.github.bael.javacourse.knight.items;

import io.github.bael.javacourse.knight.chances.Chance;
import io.github.bael.javacourse.knight.warriors.Damage;
import io.github.bael.javacourse.knight.warriors.DamageRange;

public abstract class Weapon implements Damagging, MaterialItem {

    private DamageRange damageRange;

    // максимальная прочность
    private int durability;

    // текущая прочность
    private int currentDurability;

    public Weapon(DamageRange damageRange, int durability) {
        this.damageRange = damageRange;
        this.durability = durability;
        this.currentDurability = durability;
    }

    @Override
    public DamageRange getDamageRange() {
        return damageRange;
    }

    @Override
    public Damage Strike(Chance chance) {
        //getDamageRange().getValue(chance);
        return null;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public int getRemainderDurability() {
        return currentDurability;
    }

    @Override
    public boolean repair(int count) {
        int repaircount = Math.min(getDurability() - getRemainderDurability(), count);
        currentDurability += repaircount;
        return repaircount > 0;
    }

    @Override
    public boolean destroy(int count) {
        int damagecount = Math.min(getDurability() - getRemainderDurability(), count);

        currentDurability -= damagecount;
        return damagecount > 0;
    }

    @Override
    public boolean isBroken() {
        return getRemainderDurability() > 0;
    }
}
