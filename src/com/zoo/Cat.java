package com.zoo;

public class Cat extends Animal implements Pet{
    private String name;
    {
        legs = 4;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(String.format("%s %s is playing...", getClass().getSimpleName(), getName()));
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s %s is eating...", getClass().getSimpleName(), getName()));
    }
}
