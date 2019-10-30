package com.lol.npc;

public class LittleDragon {
    private LittleDragon(){}

    private static LittleDragon instance;

    public static LittleDragon getInstance() {
        if (instance == null) {
            instance = new LittleDragon();
        }
        return instance;
    }
}

