package com.company;

public class Main {

    public static void main(String[] args) {
//        Apple apple = Apple.A;
//        Apple apple = Apple.B;

//
//        Apple apple = Apple.B;
////        System.out.println(apple==Apple.B);
////        System.out.println(apple.equals(Apple.A));
//        System.out.println(apple.A.compareTo(Apple.C));
//        for (Apple value : Apple.values()) {
//            System.out.println(value.ordinal());
//
//        }
//        switch (apple){
//            case A:
//                System.out.printf("1a");
//                break;
//            case B:
//            case C:
//        }
        Apple a=Apple.valueOf("A");
        System.out.println(a.a);

        Apple c=Apple.valueOf("C");
        System.out.println(c);

    }

}
