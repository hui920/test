package com;

public interface AP {
    public void magicAttack();
    default public void attack(){
        System.out.println();
    }
}
