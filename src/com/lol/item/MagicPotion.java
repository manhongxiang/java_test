package com.lol.item;

public class MagicPotion extends Item {
    public MagicPotion(String name, int price) {
        super(name, price);
    }

    public void effect() {
        System.out.println(String.format("使用物品%s，回了一波蓝", getName()));
    }

    @Override
    public boolean disposable() {
        return true;
    }
}
