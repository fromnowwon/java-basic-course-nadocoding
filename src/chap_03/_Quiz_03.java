package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";
        String sub = id.substring(0, id.indexOf("-") + 2);
        System.out.println(sub);
    }
}
