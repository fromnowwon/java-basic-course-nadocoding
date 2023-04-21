package chap_08;

import chap_08.Camera.Camera;
import chap_08.Camera.FactoryCam;
import chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction) - 보여줄 건 보여주고 숨길 건 숨긴다
        // 키워드: abstract
        // 추상 클래스 (아직 완성되지 않은 클래스) - 추상 클래스는 객체 생성 불가. 자식 클래스에서 상속 받아서 자식 클래스 객체를 생성해야 함
        // 추상 메서드 (추상 클래스 또는 인터페이스에서만 사용 가능한, 껍데기만 있는 메서드)

        // Camera camera = new Camera(); 추상 클래스는 객체로 만들 수 없다

        // 추상 클래스를 상속한 자식 클래스는 객체로 만들 수 있다.
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
