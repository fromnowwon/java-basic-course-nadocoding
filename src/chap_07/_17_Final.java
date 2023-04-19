package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final
        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈"; final로 선언된 경우 변경 불가
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("-------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();



    }
}
