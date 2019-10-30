package com.lol.character;

public interface Mortal {
    public void die();

    public default void revive() {
        System.out.println("本英雄复活了");
    }
}
