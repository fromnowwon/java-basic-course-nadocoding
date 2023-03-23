package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // args에 지정한 값이 출력된다.
        for (String s: args) {
            System.out.println(s);
        }

        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            System.out.println("1~3 중에 입력해주세요.");
        }
    }
}
