package com.zoo;

public class Main {
    public static void main(String[] argv) {
        System.out.println("Hello zoo!");

        System.out.println("-----------------------------");
        Pet cat = new Cat();
        cat.setName("MiYou");
        cat.play();
        ((Cat) cat).eat();
        ((Cat) cat).walk();

        System.out.println("-----------------------------");
        Fish fish = new Fish();
        fish.setName("freshFish");
        fish.play();
        fish.eat();
        fish.walk();
        System.out.println("-----------------------------");
        Spider spider = new Spider();
        spider.eat();
        spider.walk();

        System.out.println("-----------------------------");
    }
}
