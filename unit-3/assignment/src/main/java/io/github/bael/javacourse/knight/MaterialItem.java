package io.github.bael.javacourse.knight;

public interface MaterialItem {
    int getDurability();
    int getRemainderDurability();
    boolean repair(int count);
    boolean destroy(int count);
    boolean isBroken();

}
