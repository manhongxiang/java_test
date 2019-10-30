package com.number;

import java.util.Arrays;

// 如果有兴致，有空再写一次
// 缺点1：insert和append共4个函数，不用全实现，实现1个然后其他的调用即可
// 缺点2：未做边界判断（插入位置是否合法）
// 缺点3：个别不需要申请辅助数组的地方，申请数组浪费了内存

public class MyStringBuffer implements IStringBuffer {
    int size = 0;
    int capacity = 16;
    char[] data = new char [capacity];

    public MyStringBuffer() {

    }

    public MyStringBuffer(String string) {
        // resize
        int len = string.length();
        int newCapacity = capacity;
        while (size + len > newCapacity) {
            newCapacity *= 2;
        }
        if (newCapacity > capacity) {
            resize(newCapacity);
        }
        if (string.length() > capacity) {
            resize(capacity * 2);
        }

        char[] ch = string.toCharArray();
        for (int i = 0; i < len; i++) {
            data[i] = ch[i];
        }
        size = len;
    }

    private void resize(int newCapacity) {
        char[] newData = new char[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
        capacity = newCapacity;
    }

    @Override
    public void append(char c) {
        if (size == capacity) {
            resize(capacity * 2);
        }
        data[size] = c;
        size += 1;
    }

    @Override
    public void append(String string) {
        // str有可能很长，所以要先找到合适的尺寸，再resize
        int len = string.length();
        int newCapacity = capacity;
        while (size + len > newCapacity) {
            newCapacity *= 2;
        }
        if (newCapacity > capacity) {
            resize(newCapacity);
        }

        for (int i = 0; i < len; i++) {
            data[size + i] = string.charAt(i);
        }
        size += len;
    }

    @Override
    public void insert(int pos, char b) {
        if (size == capacity) {
            resize(capacity * 2);
        }

        // 先把后面的字符暂存起来
        char[] temp = Arrays.copyOfRange(data, pos, size);
        data[pos] = b;
        System.arraycopy(temp, 0, data, pos + 1, temp.length);

        size += 1;
    }

    @Override
    public void insert(int pos, String string) {
        //找到合适的长度，然后resize
        int len = string.length();
        int newCapacity = capacity;
        while (size + len > newCapacity) {
            newCapacity *= 2;
        }
        if (newCapacity > capacity) {
            resize(newCapacity);
        }

        char[] temp = Arrays.copyOfRange(data, pos, size);  //用temp会多占内存，可以先把后半段往后移，然后把string插入，可以免去创建新的ch数组
        System.arraycopy(string.toCharArray(), 0, data, pos, len);
        System.arraycopy(temp, 0, data, pos + len, temp.length);
        size += len;
    }

    @Override
    public void delete(int start) {
        //从start开始，删除剩下的所有字符
        char[] temp = new char[size - start];
        System.arraycopy(temp, 0, data, start, size - start);
        size = start;

        if (size < capacity / 4) {
            resize(capacity / 2);
        }
    }

    @Override
    public void delete(int start, int end) {
        System.arraycopy(data, end, data, start, size - end);
        size -= (end - start);

        char[] temp = new char[end - start];
        System.arraycopy(temp, 0, data, size, temp.length);

        if (size < capacity / 4) {
            resize(capacity / 2);
        }
    }

    @Override
    public void reverse() { // 新建一个数组会占内存，应该直接首尾交换
        char[] ch = new char[capacity];
        for (int i = 0; i < size; i++) {
            ch[i] = data[size - i - 1];
        }

        data = ch;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("size:%d, capacity:%d\n%s", size, capacity, String.valueOf(data));
    }

    public static void main(String[] args) {
        MyStringBuffer msb = new MyStringBuffer("abc");
        System.out.println(msb);
        msb.append("abcdefghijklm");
        System.out.println(msb);
        msb.append('n');
        System.out.println(msb);
        msb.insert(1, 'A');
        msb.insert(3, 'B');
        System.out.println(msb);
        msb.insert(5, "CDEFG");
        System.out.println(msb);
        msb.insert(24, "HIJKL");
        System.out.println(msb);
        msb.delete(10);
        System.out.println(msb);
        msb.delete(1, 5);
        System.out.println(msb);
        msb.reverse();
        System.out.println(msb);

        MyStringBuffer msb2 = new MyStringBuffer();
        System.out.println(msb2);
    }
}
