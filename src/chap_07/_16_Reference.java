package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조

        // 기본 자료형
        // 기본 자료형의 경우 값을 지정하지 않으면 0이나 0.0 등이 기본값으로 들어온다
        // 소문자로 시작한다.
        int[] i = new int[3];
        System.out.println(i[0]);

        double[] d = new double[3];
        System.out.println(d[0]);

        // 참조 자료형 (Non-Primitive, Reference Data Types): String, Camera, FactoryCam, SpeedCam
        // 참조 자료형의 경우 값을 지정하지 않으면 null이 기본값으로 들어온다.
        // 대문자로 시작한다.
        String[] s = new String[3];
        System.out.println(s[0]);

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null);

//        c[0].recordVideo(); // 참조자료형은 메서드를 가질 수 있다.


        System.out.println("------------------");

        int a = 10;
        int b = 20;

        b = a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------");

        Camera c1 = new Camera();
        Camera c2 = new Camera();

        c1.name = "카메라1";
        c2.name = "카메라2";

        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = c1;

        System.out.println(c1.name);
        System.out.println(c2.name);

        c2.name = "고장난 카메라";

        System.out.println(c1.name);
        System.out.println(c2.name);

        System.out.println("------------------");

        changeName(c2);

        System.out.println(c1.name);
        System.out.println(c2.name);

        // 참조 관계 끊기
        c2 = null;
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
