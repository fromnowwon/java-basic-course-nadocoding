package chap_07;

import chap_07.hamburger.CheeseBurger;
import chap_07.hamburger.HamBurger;
import chap_07.hamburger.ShrimpBurger;

public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("-------------------");
        for (HamBurger hamBurger: hamBurgers) {
            hamBurger.cook();
            System.out.println("---------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
