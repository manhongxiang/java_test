package com.lol.character;

public class ADAPHero extends Hero implements AD, AP, Mortal {
    public ADAPHero(String name, double hp, double armor, int moveSpeed) {
        super(name, hp, armor, moveSpeed);
    }

    @Override
    public void physicsAttack() {
        System.out.println(getName() + "不愧是ADAP英雄，居然会物理攻击！");
    }

    @Override
    public void magicAttack() {
        System.out.println(getName() + "不愧是ADAP英雄，居然会魔法攻击！");
    }

    @Override
    public void attack() {
        AD.super.attack();
        AP.super.attack();
    }

    @Override
    public void die() {
        System.out.println(String.format("ADAP英雄 %s 为国捐躯了", getName()));
    }
}
