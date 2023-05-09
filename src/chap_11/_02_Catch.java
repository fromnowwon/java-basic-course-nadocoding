package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
             System.out.println(3/0);
            int[] arr = new int[3];
            arr[5] = 100;

//            Object obj = "test";
//            System.out.println((int) obj);

            String s = null;
            System.out.println(s.toLowerCase());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("뭔가 잘못 계산했거나 인덱스 잘못 설정함");
        //} catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println("인덱스 잘못 설정함");
        } catch (ClassCastException e) {
            System.out.println("형 변환 잘못됨");
        } catch (Exception e) {
            System.out.println("그 외의 모든 에러는 여기서 처리 돼요.");
            e.printStackTrace();
        }
    }
}
