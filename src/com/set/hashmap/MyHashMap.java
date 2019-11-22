package com.set.hashmap;

import com.lol.character.Hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class MyHashMap implements IHashMap {
    private LinkedList<Entry>[] map = new LinkedList[2000];
    {
        for (int i = 0; i < map.length; i++) {
            map[i] = new LinkedList<Entry>();
        }
    }


    private static int hashcode(String string) {
        int code = 0;
        for (char c : string.toCharArray()) {
            code += c;
        }
        code *= 23;

        code = Math.abs(code);
        code %= 2000;

        return code;
    }


    @Override
    public void put(String key, Object value) {
        int index = hashcode(key);
        map[index].add(new Entry(key, value));
    }

    @Override
    public ArrayList<Entry> get(String key) {
        int index = hashcode(key);

        ArrayList<Entry> entries = new ArrayList<>();
        for (Entry e : map[index]) {
            if (e.getKey().equals(key)) {
                entries.add(e);
            }
        }
        if (entries.size() > 0) {
            return entries;
        } else{
            return null;
        }
    }


    public static void main(String[] args) {
        ArrayList<Hero> arrHeros = new ArrayList<>();
        MyHashMap mapHeros = new MyHashMap();
        for (int i = 0; i < 100000; i++) {
            Hero hero = new Hero("hero-" + (int)(Math.random() * 10000));
            arrHeros.add(hero);
            mapHeros.put(hero.getName(), hero);
        }

        long time0 = System.currentTimeMillis();

        System.out.println(mapHeros.get("hero-5555").size());

        long time1 = System.currentTimeMillis();

        ArrayList<Hero> hero5555 = new ArrayList<>();
        for (int i = 0; i < arrHeros.size(); i++) {
            if (arrHeros.get(i).getName().equals("hero-5555")) {
                hero5555.add(arrHeros.get(i));
            }
        }
        System.out.println(hero5555.size());

        long time2 = System.currentTimeMillis();

        System.out.println(time1 - time0);
        System.out.println(time2 - time1);
    }
}
