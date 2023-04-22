package chap_07.camera;

import chap_08.detector.AccidentDetector;
import chap_08.reporter.VideoReporter;

public class SpeedCam extends Camera { // 자식 클래스
    public SpeedCam() {
        super("과속단속 카메라"); // 부모 클래스의 생성자에 접근
    }

    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation
    public void showNameFeature() {
        System.out.println(this.name + "의 주요 기능: 속도 측정, 번호 인식");
    }

    public void setDetector(AccidentDetector accidentDetector) {
    }

    public void setReporter(VideoReporter videoReporter) {
    }

}
