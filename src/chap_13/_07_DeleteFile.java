package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공: " + file.getName());
            } else {
                System.out.println("파일 삭제 실패");
            }
        }

        File folder = new File("A/B/C");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공: " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패: " + folder.getAbsolutePath());
            }
        }
    }
}
