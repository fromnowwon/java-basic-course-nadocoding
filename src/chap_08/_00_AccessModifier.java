package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifier {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public 제어자
        // b1.resolution = "FHD"; // default: 같은 패키지 내에서만 접근 가능
        // b1.price = 200000; // private 제어자: 같은 클래스 내에서만 접근 가능
        // b1.color = "black"; // protected 제어자: 같은 패키지 내에서, 또는 다른 패키지인 경우 자식 클래스에서 접근 가능
    }
}
