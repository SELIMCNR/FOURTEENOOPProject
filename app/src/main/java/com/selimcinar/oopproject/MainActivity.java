package com.selimcinar.oopproject;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Constructor değer atama
      User myUser = new User("Selim" ,"Instructor");
      myUser.information();//abstract classtaki bilgi
      System.out.println(myUser);

      //Encapsulation Yazılan kodlara erişim kısıtlamaları getirilir.
        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.getName());
        james.setAge(60,"Selim");
        System.out.println(james.getAge());

        //Inheritance Miras alma
        SuperMusician lars = new SuperMusician("Lars","Drums",55);
        System.out.println(lars.sing());
        //Kalıtım üzerinden gelen değerler yazdırılıyor.
        System.out.println(lars.getAge());
        System.out.println(lars.getName());

        //Polymorphism : Çok biçimlilik,Bir metodun aynı isimle birden fazla işte kullanılması.

        //Static Polymorphism : Aynı sınıfın içerisinde farklı metotları aynı isimde kullanmaya denir.

        //Aynı metotla farklı sonuçlar elde ediliyor
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));


        //Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test(); //Miras alınan classtaki metot
        barley.sing(); // Class içerisindeki metot

        //Abstract Soyut sınıf & Interface arayüz
        Piano myPiano = new Piano();
        myPiano.brand="Yamaha";
        myPiano.digital=true;
        myPiano.info();


    }
}
