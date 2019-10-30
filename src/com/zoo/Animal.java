package com.zoo;

public abstract class Animal {
    protected int legs;

    public Animal(){}

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println(String.format("%s walks with %d legs.",getClass().getSimpleName(), legs));
    }
}
