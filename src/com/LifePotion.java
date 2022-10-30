package com;

public class LifePotion extends Item{
    public void effect(){
        System.out.println("血瓶");
    }
    public void buy(){
        System.out.println("ds");
    }

    @Override
    public boolean disposable() {
        return true;
    }
}
