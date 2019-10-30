package com.lol.item;

public class Armor extends Item {
    private int ac;

    public Armor(String name, int price, int ac) {
        super(name, price);
        this.ac = ac;
    }

    @Override
    public boolean disposable() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", ac:" + ac;
    }
}
