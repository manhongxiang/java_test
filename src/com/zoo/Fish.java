package com.zoo;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
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
    public void walk() {
        System.out.println("Fish is swimming");
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
