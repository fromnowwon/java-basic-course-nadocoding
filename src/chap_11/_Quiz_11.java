package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 2;
        try {
            if (errorCode == 0) {
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (errorCode == 1) {
                throw new NotOnSaleException("상품 구매 가능 시간 아님");
            } else if (errorCode == 2) {
                throw new SoldOutException("해당 상품 매진");
            }
        } catch (NotOnSaleException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능");
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class NotOnSaleException extends Exception {
    public NotOnSaleException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}