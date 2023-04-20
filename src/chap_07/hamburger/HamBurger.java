package chap_07.hamburger;

public class HamBurger {
    public String name;

    // 생성자
    public HamBurger() {
        this("햄버거");
    }

    protected HamBurger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}
