package me.whiteship.designpatterns._02_structural_patterns._07_bridge.ex_after;

public class KDB카이사 implements Champion {
    @Override
    public void move() {
        System.out.println("KDB 카이사 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDB 카이사 Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDB 카이사 W");
    }

    @Override
    public void skillE() {
        System.out.println("KDB 카이사 E");
    }

    @Override
    public void skillR() {
        System.out.println("KDB 카이사 R");
    }
}
