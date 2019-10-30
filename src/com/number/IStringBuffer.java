package com.number;

public interface IStringBuffer {
    public void append(String string);

    public void append(char c);

    public void insert(int pos, char b);

    public void insert(int pos, String string);

    public void delete(int start);

    public void delete(int start, int end);

    public void reverse();

    public int length();
}
