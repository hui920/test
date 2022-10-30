package com;

public class MagicPotion extends Item{
    public void effect(){
        System.out.println("蓝瓶");
    }

    @Override
    public boolean disposable() {
        return false;
    }
}
