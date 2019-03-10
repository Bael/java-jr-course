package io.github.bael.javacourse.knight;

public abstract class Weapon implements Damagging, MaterialItem {

    private IntValueRange damageRange;

    // максимальная прочность
    private int durability;

    // текущая прочность
    private int currentDurability;

    public Weapon(IntValueRange damageRange, int durability) {
        this.damageRange = damageRange;
        this.durability = durability;
        this.currentDurability = durability;
    }


    @Override
    public IntValueRange getDamage() {
        return damageRange;
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
