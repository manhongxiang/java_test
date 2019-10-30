package com.lol.item;

public class Weapon extends Item {
    int damage;

    public Weapon(String name, int price, int damage) {
        super(name, price);
        this.damage = damage;
    }

    @Override
    public boolean disposable() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", damage:" + damage;
    }
}
