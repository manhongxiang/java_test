package com.set;

public interface Stack<E> {
    public boolean empty();

    public E peek();

    public E pop();

    public void push(E e);
}
