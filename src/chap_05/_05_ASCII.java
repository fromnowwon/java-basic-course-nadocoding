package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI): 미국 표준 코드
        char c = 'A'; // 알파벳 대문자는 65부터 시작,  소문자는 97부터 시작, 숫자는 48부터 시작
        System.out.println(c); // A
        System.out.println((int)c); // 65

        c = 'B';
        System.out.println(c);
        System.out.println((int)c); // 66

        c++;
        System.out.println(c);
        System.out.println((int)c); // 67
    }
}
