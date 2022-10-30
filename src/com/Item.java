package com;

public abstract class Item {
    String name;
    int price;
    public abstract boolean disposable();

    public void effect(){
        System.out.println("物品");
    }
    public String toString(){
        return "叫做"+name+"的物品，起价格是"+price;
    }

    public void finalize(){
        System.out.println("回收");
    }
    public boolean equals(Object o ){
        if (o instanceof Item){
            Item i =(Item) o;
            if (i.price==this.price)
                return true;
            else
                return false;
        }
        return false;
    }
    public static void main(String[] args) {

        Item i = new Item(){
           public boolean disposable(){
               return false;
          }
        };
        System.out.println(i.disposable());

        float f=3.14f;
        Float i11 =f;
        String s= i11.toString();
        String ss=String.valueOf(f);
        System.out.println(s+ss);


        float aa=Float.parseFloat(s);
        System.out.println(aa);
//        Float.parseFloat("3.1a4");
        System.out.println((double) Math.random()*10);
    }
}

