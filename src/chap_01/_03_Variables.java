package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다.");
        System.out.println(hour + "시에 방문 예정입니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789; // float보다 정밀하다.
//        float f = 3.14; 실수 값은 float 변수로 표현할 수 없다.
        float f = 3.14123456789F; // float 자료형으로 만들어 float 변수에 넣을 수 있다.

        System.out.println(d);
        System.out.println(f);

        // int i = 1000000000000;
        long l = 1000000000000L; // int보다 큰 범위
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
