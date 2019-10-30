package com.lol.character;

public interface AP {
    public void magicAttack();

    public default void attack() {
        System.out.println("来自AP的attack");
    }
}
