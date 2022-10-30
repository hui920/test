package com;

public class APHero extends Hero implements AP,Mortal{
    @Override
    public void die() {
        System.out.println(name+"死了ap");
    }
//    APHero(){
//        super("");
//    }

    @Override
    public void attack() {
        magicAttack();
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
}
