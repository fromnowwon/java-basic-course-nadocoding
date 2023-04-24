package chap_09;

import chap_09.coffee.Coffee;
import chap_09.coffee.CoffeeByName;
import chap_09.coffee.CoffeeByNickname;
import chap_09.coffee.CoffeeByNumber;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("----------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        
        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("----------------------");

        // 제너릭 클래스 사용
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
    }
}