package com.selimcinar.oopproject;

//Dynamic Polymorphism
public class Dog extends Animal {
    public void test (){
        super.sing(); //Diğer classtan miras alınan yapı
    }
    public  void sing(){ //Bu classta aynı isimde oluşmuş metot.
        System.out.println("dog class");
    }
}
