package com.lol.item;

public abstract class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void buy() {
        System.out.println(String.format("花了%d金币购买了物品%s", price, name));
    }

    public void effect() {
        System.out.println("使用了" + name);
    }

    @Override
    public String toString() {
        return String.format("[Item] name:%s, price:%d", name, price);
    }

    @Override
    public void finalize(){
        System.out.println("该对象正在被回收");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            if (getPrice() == ((Item) obj).getPrice()) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean disposable();
}
