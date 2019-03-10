package io.github.bael.javacourse.knight.warriors;

public class WarriorState implements ActorState {

    private int attackLvl;
    private int defenceLvl;
    private int hp;
    private int initialHP;
    private int level;
    private int strength;


    private WarriorState(int attackLvl, int defenceLvl, int hp, int level, int strength) {
        this.attackLvl = attackLvl;
        this.defenceLvl = defenceLvl;
        this.hp = hp;
        this.initialHP = hp;
        this.level = level;
        this.strength = strength;

    }

    public static WarriorStateBuilder builder() {
        return new WarriorStateBuilder();
    }


    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public int getMaxHP() {
        return initialHP;
    }

    @Override
    public double getHPState() {
        if (getMaxHP() == 0) {
            return 0;
        }

        return (double) getHP() / getMaxHP();

    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getAttackLevel() {
        return attackLvl;
    }

    @Override
    public int getDefenceLevel() {
        return defenceLvl;
    }

    @Override
    public boolean isAlive() {
        return getHP() > 0;
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("taking damage " + damage);
        hp -= Math.min(hp, Math.max(0, damage));
    }

    public static class WarriorStateBuilder {
        private int attackLvl;
        private int defenceLvl;
        private int hp;
        private int level;
        private int strength;


        public WarriorStateBuilder attackLevel(int attackLvl) {
            this.attackLvl = attackLvl;
            return this;
        }

        public WarriorStateBuilder defenceLevel(int defenceLvl) {
            this.defenceLvl = defenceLvl;
            return this;
        }

        public WarriorStateBuilder level(int level) {
            this.level = level;
            return this;
        }

        public WarriorStateBuilder hp(int hp) {
            this.hp = hp;
            return this;
        }

        public WarriorStateBuilder strength(int strength) {
            this.strength = strength;
            return this;
        }

        private void requirePositive(int value) {
            if (value < 0) {
                throw new IllegalArgumentException();
            }
        }


        public WarriorState build() {
            requirePositive(this.attackLvl);
            requirePositive(this.defenceLvl);
            requirePositive(this.hp);
            requirePositive(this.level);
            requirePositive(this.strength);

            return new WarriorState(this.attackLvl, this.defenceLvl, this.hp, this.level, this.strength);
        }


    }
}
