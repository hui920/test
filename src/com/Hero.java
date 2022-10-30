package com;
public abstract class Hero {
    int moveSpeed;
        public String name;
        protected float hp=5;

        public abstract void attack();

        public boolean equals(Object o){
            if (o instanceof Hero){
                Hero h = (Hero)o;
                return this.hp==h.hp;
            }
            return false;
        }
        public static void main(String[] args) {
//            Hero h1 = new Hero();
//            h1.hp=300;
//            Hero h2=new Hero();
//            h2.hp=200;
//            Hero h3=new Hero();
//            h3.hp=300;
//            Hero h4=h3;

//            System.out.println(h1.equals(h2));
//            System.out.println(h1.equals(h3));
//            System.out.println(h3.equals(h4));
//            System.out.println(h1==h2);
//            System.out.println(h1==h3);
//            System.out.println(h3==h4);
            ADHero adh=new ADHero();
            adh.attack();
            System.out.println(adh);

            Hero h =new Hero(){
                public void attack(){
                    System.out.println("新的"+hp);
                }
            };
            h.attack();
            System.out.println(h);
        }

}
;
