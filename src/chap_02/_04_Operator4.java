package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 제육볶음 = false;
        boolean 계란말이 = true;

        System.out.println(김치찌개 || 제육볶음 || 계란말이);
        System.out.println(김치찌개 && 계란말이 && 제육볶음);

        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) || (3 > 1));
    }
}
