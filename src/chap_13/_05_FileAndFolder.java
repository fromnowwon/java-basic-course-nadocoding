package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        // String folder = "/Users/chaewonjeong/Documents/coding/lecture/nadocoding/나도코딩의 자바 기본편/JavaWorkspace/src/chap_13"; // 현재 위치
        String folder = "src/chap_13";
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로: " + filesAndFolders.getAbsolutePath());

        for (File file : filesAndFolders.listFiles()) {
            if (file.isFile()) {
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
        }

    }
}
