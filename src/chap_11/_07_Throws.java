package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메서드에서 해결");
        }
    }

    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일 쓰기 실패");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 내에서 에러 해결함");
//        }

        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기 실패");
    }
}
