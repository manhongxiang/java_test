package com.zoo;

public class Spider extends Animal {
    public Spider() {
        legs = 8;
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s eats!", getClass().getSimpleName()));
    }
}
