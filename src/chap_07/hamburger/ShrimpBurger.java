package chap_07.hamburger;

public class ShrimpBurger extends HamBurger {
    public ShrimpBurger() {
        super("새우버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}
