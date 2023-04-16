package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person: 사람
        // class Student extends Person: 학생 (학생은 사람이다. Student is a person => IS-A 관계)

        // 부모 클래스로 선언할 수 있다.
        Camera camera = new Camera();
        // FactoryCam factoryCam = new FactoryCam();
        Camera factoryCam = new FactoryCam();
        // SpeedCam speedCam = new SpeedCam();
        Camera speedCam = new SpeedCam();

        camera.showNameFeature();
        factoryCam.showNameFeature();
        speedCam.showNameFeature();

        System.out.println("------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showNameFeature();
        }

        System.out.println("------------------------");

        // 부모 클래스로부터 생성된 객체이기 때문에 자식 클래스에 바로 접근할 수 없다.
//        factoryCam.detectFire();
//        speedCam.checkSpeed();
//        speedCam.recognizeLicensePlate();

        if (camera instanceof Camera) {
            // Camera 클래스로부터 생성된 인스턴스인 경우
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            // Camera로부터 생성된 객체에서 FactoryCam으로부터 생성된 객체로 형변환
            ((FactoryCam)factoryCam).detectFire(); // 메서드 사용 가능
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }

        // Object는 모든 클래스가 참조하는 객체
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
    }
}
