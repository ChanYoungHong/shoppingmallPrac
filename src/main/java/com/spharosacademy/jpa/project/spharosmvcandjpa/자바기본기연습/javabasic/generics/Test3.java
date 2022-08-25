package com.spharosacademy.jpa.project.spharosmvcandjpa.자바기본기연습.javabasic.generics;

public class Test3 {

    static <T> void genericDisplay(T element) {

        System.out.println(element.getClass().getName() + " = " + element);
    }

    class Test4<T> {

        T obj;

        public Test4(T obj) {
            this.obj = obj;
        }

        public T getObj() {
            return this.obj;
        }


    }

    public static void main(String[] args) {

        genericDisplay(11);

        genericDisplay("GeeksForGeeks");

        genericDisplay(1.0);

        genericDisplay(new int[]{1,2,3,4,5,6,7,8});


        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObj());

        Test<String> sObj = new Test<String>("GEETKKKKKKKKKKKK");
        System.out.println(sObj.getObj());
//        iObj = sObj;
    }
}
