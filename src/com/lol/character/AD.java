package com.lol.character;

public interface AD {
    public void physicsAttack();

    public default void attack() {
        System.out.println("来自AD的attack");
    }
}
