package com.set;

import com.lol.character.Hero;

import java.util.LinkedList;

public class LinkedStack<E> implements Stack<E> {
    private LinkedList<E> data = new LinkedList<>();

    @Override
    public boolean empty() {
        return data.size() == 0;
    }

    @Override
    public E peek() {
        return data.peek();
    }

    @Override
    public E pop() {
        return data.pop();
    }

    @Override
    public void push(E e) {
        data.push(e);
    }

    public static void main(String[] args) {
        LinkedStack<Hero> heros = new LinkedStack<>();
        for (int i = 0; i < 5; i++) {
            heros.push(new Hero("hero" + i));
        }

        for (int i = 0; i < 5; i++) {
            Hero hero = heros.pop();
            System.out.println(hero);
        }
    }
}
