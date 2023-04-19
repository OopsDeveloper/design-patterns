package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._03_java;

public class FlyweightInJava {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10000);
        Integer i2 = Integer.valueOf(10000);
        System.out.println(i1 == i2); // 숫자나 문자열 비교는 == 를 안쓰는 것이 좋다.
        System.out.println(i1.equals(i2));
    }
}
