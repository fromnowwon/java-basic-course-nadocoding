package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 (Encapsulation)
        // 정보 은닉 (Information hiding)
            // 접근 제어자를 통해 캡슐화와 정보은닉화

        // 접근 제어자
        // private: 해당 클래스 내에서만 접근 가능
        // public: 모든 클래스에서 접근 가능
        // default: (아무것도 적지 않음) 같은 패키지 내에서만 접근 가능
        // protected: 같은 패키지 내에서는 접근 가능하고, 다른 패키지인 경우 자식 클래스에서 접근 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "black";

        // 할인 행사
        b1.setPrice(-5000); // 잘못된 할인
        System.out.println("가격: " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도: " + b1.resolution); // 없는 값

        System.out.println("------------");

    }
}
