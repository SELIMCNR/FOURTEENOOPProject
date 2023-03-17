package com.selimcinar.oopproject;

public class Musicians {

    private String name;
    private String instrument;
    private int age;


    //Constructor oluşturldu
    public  Musicians(String name,String instrument,int age){
        this.name=name;
        this.instrument=instrument;
        this.age=age;
    }

    //Getter getir  değeri getir yazdır.
    //Setter ekle değiştir değeri

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getAge() {
        return age;
    }

    //Erişim yada değeri değiştirmek için ekstra parametre ile şifre sorgulama
    public void setAge(int age,String password) {
        if (password.matches("Selim")){
            this.age = age;
        }

    }


}
