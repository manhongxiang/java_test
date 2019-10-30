package com.lol.character;

public enum HeroTypeEnum {
    TANK(1), WIZARD(2), ASSASSIN(3), ASSIST(4), WARRIOR(5), RANGED(6), PUSH(7), FARMING(8);

    private int value = 0;

    private HeroTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
