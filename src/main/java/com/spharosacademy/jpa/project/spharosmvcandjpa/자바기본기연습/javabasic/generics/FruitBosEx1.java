package com.spharosacademy.jpa.project.spharosmvcandjpa.자바기본기연습.javabasic.generics;

import java.util.ArrayList;

class Fruit {

    public String toString() {
        return "Fruit";
    }
}
class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}


public class FruitBosEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
        Box<Grape> grapeBox = new Box<Grape>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
//        appleBox.add(new Toy());

        toyBox.add(new Toy());
//        toyBox.add(new Apple());

        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());


        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
        System.out.println(grapeBox);

    }


}


class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {
        list.add(item);
    }
    T get(int i) {
        return list.get(i);
    }
    int size() {
        return list.size();
    }
    public String toString() {
        return list.toString();
    }
}
