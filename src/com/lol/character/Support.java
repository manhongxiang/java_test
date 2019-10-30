package com.lol.character;

public class Support extends Hero implements Healer{
    public Support(String name, double hp, double armor, int moveSpeed) {
        super(name, hp, armor, moveSpeed);
    }

    public void heal() {
        System.out.println(getName() + "不愧是辅助英雄，居然会治疗！");
    }

    public void heal(Hero hero) {
        System.out.println(String.format("%s对%s进行了治疗", getName(), hero.getName()));
    }

    public void heal(Hero hero, double hp) {
        System.out.println(String.format("%s为%s治疗了%.1f点hp", getName(), hero.getName(), hp));
    }
}
