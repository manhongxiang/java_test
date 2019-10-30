package com.lol.item;

import com.lol.npc.LittleDragon;

public class LifePotion extends Item {
    public LifePotion(String name, int price) {
        super(name, price);
    }

    @Override
    public void effect() {
        System.out.println(String.format("使用了物品%s，回了一波血", getName()));
    }

    @Override
    public boolean disposable() {
        return true;
    }
}
