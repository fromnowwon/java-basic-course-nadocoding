package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name); // 상속된 name 사용
        System.out.println(speedCam.name); // 상속된 name 사용

        camera.takePicture();
        factoryCam.recordVideo(); // 상속된 메서드 사용
        speedCam.takePicture(); // 상속된 메서드 사용

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
