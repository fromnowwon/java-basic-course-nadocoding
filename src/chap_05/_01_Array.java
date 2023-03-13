package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "바닐라라떼";

        // 배열 선언 방법 1.
        // String[] coffees = new String[4];

        // 배열 선언 방법 2.
        // String coffees[] = new String[4];

//        coffees[0] = coffeeRoss;
//        coffees[1] = coffeeRachel;
//        coffees[3] = coffeeChandler;
//        coffees[4] = coffeeMonica;

        // 배열 선언 방법 3.
//        String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "바닐라라떼"};

        // 배열 선언 방법 4.
        String[] coffees = {"아메리카노", "카페모카", "라떼", "바닐라라떼"};

        System.out.println(coffees[0] + " 하나");
        System.out.println(coffees[1] + " 하나");
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");

    }
}
