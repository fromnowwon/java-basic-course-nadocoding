package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류: 컴파일 오류(코드에 오류가 있어 빌드가 안됨), 런타임 오류(컴파일은 되는데 실행하는 과정에서 에러)
        // 에러 vs 예외

        try {
            // System.out.println(3/0);
            // int[] arr = new int[3];
            // arr[5] = 100;

            Object obj = "test";
            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 -> " + e.getMessage());
            e.printStackTrace();
        }
    }
}
