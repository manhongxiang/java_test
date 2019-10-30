package com.lol.character;

public class APHero extends Hero implements AP, Mortal {
    public APHero(String name, double hp, double armor, int moveSpeed) {
        super(name, hp, armor, moveSpeed);
    }

    @Override
    public void magicAttack() {
        System.out.println(String.format("%s不愧是法师英雄，竟然会放技能！", getName()));
    }

    @Override
    public void die() {
        System.out.println(String.format("APHero %s 为国捐躯了", getName()));
    }
}
