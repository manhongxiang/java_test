package com.lol.character;

public class ADHero extends Hero implements AD, Mortal {
    public ADHero() {
        System.out.println("ADHero的无参构造方法");
    }
    public ADHero(String name, double hp, double armor, int moveSpeed) {
        super(name, hp, armor, moveSpeed);
    }

    public static void battleWin() {
        System.out.println("ADHero wins!");
    }

    @Override
    public void physicsAttack() {
        System.out.println(String.format("%s不愧是ADC，竟然会物理攻击！", getName()));
    }

    @Override
    public void die() {
        System.out.println(String.format("ADHero %s 为国捐躯了", getName()));
    }

    public void attack() {
        System.out.println(String.format("%s发起了攻击，然而攻击到了空气", getName()));
    }

    public void attack(Hero h1) {
        System.out.println(String.format("%s向%s发起了攻击", getName(), h1.getName()));
    }

//    public void attack(Hero h1, Hero h2) {
//        System.out.println(String.format("%s同时向%s和%s发起了攻击", getName(), h1.getName(), h2.getName()));
//    }
    public void attack(Hero ...heros){
        System.out.print(String.format("%s同时向", getName()));
        for (int i = 0; i < heros.length - 1; i++) {
            System.out.print(heros[i].getName());
            if (i != heros.length - 2){
                System.out.print("、");
            }
        }
        System.out.println("和" + heros[heros.length - 1].getName() + "发起了攻击！");
    }

}
