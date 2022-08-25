package com.spharosacademy.jpa.project.spharosmvcandjpa.자바기본기연습.javabasic.generics;

public class Test <T> {

    T obj;

    public T getObj() {
        return obj;
    }

    public Test(T obj) {
        this.obj = obj;
    }

}

class Test2<T, U> {

    T obj1;
    U obj2;

    public Test2(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }

}

class Main {
    public static void main(String[] args) {

        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObj());

        Test<String> sObj
            = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObj());


        Test2<String, Integer> obj =
            new Test2<String, Integer>("GfG", 15);

        obj.print();
    }
}
