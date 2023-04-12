package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();

        b1.autoReport();
        BlackBox.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(256);

        // 일반 영상: 1
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 수: " + fileCount + "개");
        
        // 이벤트 영상 (충돌 감지): 2
        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 수: " + fileCount + "개");

    }
}
