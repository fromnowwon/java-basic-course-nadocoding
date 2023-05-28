package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir(); // 단일 경로
        if (folder.exists()) {
            System.out.println("폴더 존재함: " + folder.getAbsolutePath());
        }

        folderName = "A/B/C";
        // folderName = "A" + File.separator + "B" + File.separator + "C";
        folder = new File(folderName);
        folder.mkdirs(); // 여러 하위 경로
        if (folder.exists()) {
            System.out.println("폴더 존재함: " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
