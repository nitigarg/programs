package org.example;

import javax.swing.text.html.parser.TagElement;

public class Copyconstructor {
    int age;
    String name;
    Copyconstructor(int age, String name){
        this.age= age;
        this.name=name;
    }
    //constructor for copying the values
    Copyconstructor(Copyconstructor obj){
        this.age=obj.age;
        this.name=obj.name;
    }
    void display(){
        System.out.println("age "+this.age+" "+"name "+this.name);
    }
    public static void main(String args[]){
        Copyconstructor obj1=new Copyconstructor(25,"Ram");
        Copyconstructor obj2=new Copyconstructor(obj1);
        obj1.display();
        obj2.display();
    }

}
