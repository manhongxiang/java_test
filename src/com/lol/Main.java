package com.lol;

import com.lol.character.*;
import com.lol.item.*;
import com.lol.npc.*;

import javax.annotation.processing.SupportedOptions;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Armor armor1 = new Armor("复活甲", 5000, 4);
        Armor armor2 = new Armor("魔女斗蓬", 3000, 5);
        System.out.println(armor1);
        System.out.println(armor2);

        ADHero hb = new ADHero("寒冰", 2000, 3.2, 55);
        Hero xh = new Hero("小黑", 2000, 5.5, 55);
        APHero aql = new APHero("安琪拉", 1500, 2.5, 512);
        Support qn = new Support("琴女", 1000, 1.5, 66);

        System.out.println(hb instanceof Hero);
        System.out.println(hb instanceof ADHero);
        System.out.println(xh instanceof Support);

        System.out.println("------------------------");
        hb.physicsAttack();
        hb.attack();
        hb.attack(xh);
        hb.attack(xh, aql);
        hb.attack(xh, aql, qn);

        System.out.println("------------------------");
        aql.magicAttack();

        System.out.println("------------------------");
        qn.heal();
        qn.heal(xh);
        qn.heal(hb, 500);

        System.out.println("------------------------");
        GiantDragon giantDragon = GiantDragon.getInstance();
        GiantDragon giantDragon1 = GiantDragon.getInstance();
        System.out.println(giantDragon == giantDragon1);

        LittleDragon littleDragon = LittleDragon.getInstance();
        LittleDragon littleDragon1 = LittleDragon.getInstance();
        System.out.println(littleDragon == littleDragon1);

        System.out.println("------------------------");
        for (HeroTypeEnum heroTypeEnum : HeroTypeEnum.values()) {
            switch (heroTypeEnum) {
                case TANK:
                    System.out.println("坦克");
                    System.out.println(heroTypeEnum.getValue());
                    break;
                case WIZARD:
                    System.out.println("法师");
                    break;
                case ASSASSIN:
                    System.out.println("刺客");
                    break;
                case ASSIST:
                    System.out.println("辅助");
                    break;
                case WARRIOR:
                    System.out.println("近战");
                    break;
                case RANGED:
                    System.out.println("远程");
                    break;
                case FARMING:
                    System.out.println("打野");
                    break;
                case PUSH:
                    System.out.println("推进");
                    break;
            }
        }
        System.out.println(Arrays.toString(HeroTypeEnum.values()));

        System.out.println("------------------------");
        LifePotion lifePotion = new LifePotion("血瓶", 300);
        lifePotion.effect();
        MagicPotion magicPotion = new MagicPotion("魔瓶", 300);
        magicPotion.effect();

        System.out.println("------------------------");

        xh.kill(hb);
        xh.kill(aql);

        xh.battleWin();
        xh = hb;
        xh.battleWin();
        hb.battleWin();

        System.out.println("------------------------");
        Hero hero = new Hero();
        ADHero adHero = new ADHero();
        ADHero adHero1 = new ADHero("adc", 1, 1, 1);

        System.out.println("------------------------");
        Item item = new Weapon("打野刀", 300, 20);
        System.out.println(lifePotion.equals(magicPotion));
        System.out.println(item.equals(lifePotion));
        System.out.println(lifePotion);
        System.out.println(item);
        Item mysteriosItem = new Item("匿名物品", 200){
            @Override
            public boolean disposable() {
                return false;
            }
        };
        System.out.println(mysteriosItem);
        System.out.println(mysteriosItem.disposable());
        System.out.println(lifePotion.disposable());

        System.out.println("------------------------");
        ADAPHero ys = new ADAPHero("亚瑟", 2500, 22, 80);
        ys.attack();
    }
}