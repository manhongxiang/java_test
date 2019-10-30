import com.lol.character.Hero;

import java.util.*;

public class Main {
    public static void main(String[] args){

        LinkedList<Hero> heros = new LinkedList<>();
        heros.add(new Hero("hero1"));
        heros.add(new Hero("hero2"));

        System.out.println(Arrays.toString(heros.toArray(new Hero[0])));
    }
}