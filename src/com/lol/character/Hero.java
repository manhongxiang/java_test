package com.lol.character;

public class Hero {
    public static final int itemTotalNumber = 6;
    private String name;
    private double hp;
    private double armor;
    private int moveSpeed;

    public Hero(){
        System.out.println("Hero的无参构造方法");
    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    public Hero(String name, double hp, double armor, int moveSpeed){
        this(name, hp);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    public static void battleWin() {
        System.out.println("Hero wins!");
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getArmor() {
        return armor;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void kill(Mortal mortal) {
        System.out.print(getName() + "手起刀落，");
        mortal.die();
    }

    @Override
    public String toString() {
        return name;
    }
}
