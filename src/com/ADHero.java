package com;

public class ADHero extends Hero implements AD,Mortal{
//    public void attack(){
//        System.out.println(name+"进行了一次攻击");
//    }
//    public void attack(Hero h1){
//        System.out.println(name+"gongjil"+h1.name);
//    }
//    public void attack(Hero h1,Hero h2){
//        System.out.println(name+"gongj"+h1.name+"he"+h2.name);
//    }

    @Override
    public void attack() {
        physicAttack();
    }



    int moveSpeed=400;
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }
    public void die(){
        System.out.println(name+"死了ad");
    }
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
    public void attack(Hero...heros){
        for (int i=0;i<heros.length;i++){
            System.out.println(name+"攻击了"+heros[i].name);
        }
    }
//    public ADHero(){
//        super("");
//        System.out.println("ad无参");
//    }
//    public ADHero(String name){
//        super(name);
//        System.out.println("ad有参");
//    }

    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    public static void main(String[] args) {
//        ADHero bh=new ADHero();
//        bh.name="赏金猎人";
//
//        Hero h1=new Hero();
//        h1.name="盖伦";
//        Hero h2=new Hero();
//        h2.name="提莫";
//
//        bh.attack();
//        bh.attack(h1);
//        bh.attack(h1,h2);
//        Hero h=new ADHero();
//        h.battleWin();

//        new Hero();
//        new ADHero();
//        new ADHero("多少");
        ADHero h=new ADHero();
//        System.out.println(h.getMoveSpeed());
//        System.out.println(h.getMoveSpeed2());
    }


}
