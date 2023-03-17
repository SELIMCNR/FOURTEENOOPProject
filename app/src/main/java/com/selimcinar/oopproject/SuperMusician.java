package com.selimcinar.oopproject;

//extends ile diğer classtan miras al
public class SuperMusician extends Musicians {

    public SuperMusician(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    //Kalıtım inheritance
    //Bir sınıfta sadece property varsa constructor istemez, sınıfın içerisinde
    //constructorda varsa bu sınıfta da constructor olmalı
    public  String sing(){
        return  "Nothing Else Matters";
    }
}
