package com;

public class Weapon extends Item{
//    String name;
//    int price;
    int damage;

    @Override
    public boolean disposable() {
        return false;
    }

    public static void main(String[] args) {
        Weapon infinityEage = new Weapon();
        infinityEage.damage=65;
        infinityEage.name="无尽之刃";
        infinityEage.price=3600;
    }
}
