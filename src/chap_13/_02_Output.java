package chap_13;

public class _02_Output {
    public static void main(String[] args) {
//        System.out.format();
//        System.out.printf();
        System.out.println("------- 정수 -------");
        System.out.printf("%d%n", 1);
        System.out.printf("%d %d %d%n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234);
        System.out.printf("%06d%n", 1234);
        System.out.printf("%6d%n", -1234);
        System.out.printf("%+6d%n", 1234);
        System.out.printf("%,15d%n", 1000000000);
        System.out.printf("%-6d%n", 1234);

    }
}
