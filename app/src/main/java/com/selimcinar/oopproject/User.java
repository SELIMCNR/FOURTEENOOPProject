package com.selimcinar.oopproject;

public class User extends People{
    //Property özellikler ekleniyor
    String name;
    String job;

    //Constructor Oluşturucu
    public User(String name, String job) { //User adlı sınıf oluşturuyor
        this.name = name; //Propertieslerle aldığı inputları parametreleri eşitliyor.
        this.job = job;
    }
}
