package chap_07;

public class BlackBox {
    // 인스턴스 변수
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 넘버

    static int counter = 0; // 시리얼 번호 생성 역할

    // 클래스 변수
    // static을 붙이면 클래스 변수가 된다.
    // 모든 객체에 똑같이 적용된다.
    static boolean canAutoReport = false; // 자동 신고 기능
    
    // 기본 생성자
    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급받았습니다: " + this.serialNumber);
    }

    // 생성자 overloading
    BlackBox(String modelName, String resolution, int price, String color) {
        this(); // 기본 생성자에 접근해서 수행

        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            // 일반 영상
            return 9;
        } else if (type == 2) {
            // 이벤트 영상
            return 1;
        }
        return 10;
    }

    // 날짜정보 표시여부 / 속도정보 표시여부 / 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000)로 연결합니다.");
        // modelName = "TEST";  => 에러
        canAutoReport = false; // static으로 선언한 클래스 변수는 클래스 메서드 안에서 사용 가능하다.
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }
}
