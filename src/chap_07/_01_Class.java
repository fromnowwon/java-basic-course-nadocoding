package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP: Object-Oriented Programming)
        // 유지 보수 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상

        // 첫 번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "black";

        // 두 번째 제품
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "white";

        // 제품 여러 개...

        // 클래스 = 설계도, 설계도를 통한 제품 = 객체
        // BlackBox 클래스로부터 bbox 객체 생성
        BlackBox bbox = new BlackBox();
        BlackBox bbox2 = new BlackBox();




    }
}
