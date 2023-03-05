package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (꽁백 불가)
        // 3. 밑줄 또는 문자로 시작
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int ...)

        // 입국 신고서
        String nationality = "대한민국";
        String firstName = "CW";
        String lastName = "J";
        String dateOfBirth = "2001-12-31";
        String residentialAddress = "무슨 호텔";
        String purposeOfVisit = "관광";
        String flightNo = "KE657";
        String _flightNo = "KE657";
        String flight_no_2 = "KE657";
        int accompany = 2;
        int lengthOfStay = 10;
        String item1 = "시계";

        // 프로그램의 흐름을 위해 사용되는 경우 등 (이름이 크게 중요하지 않을 때)
        int i = 0;
        String s = "";

        // 절대 변하지 않는 상수는 대문자로 + final
        final String CODE = "KR";

    }
}
