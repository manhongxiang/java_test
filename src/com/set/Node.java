package com.set;

public class Node<T> {
    public Node leftNode;
    public Node rightNode;
    public T value;

    public Node() { }

    public Node(T value) {
        this.value = value;
    }
}
