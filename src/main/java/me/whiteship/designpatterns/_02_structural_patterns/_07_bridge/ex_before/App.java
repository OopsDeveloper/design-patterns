package me.whiteship.designpatterns._02_structural_patterns._07_bridge.ex_before;

import me.whiteship.designpatterns._02_structural_patterns._07_bridge._01_before.Champion;
import me.whiteship.designpatterns._02_structural_patterns._07_bridge._01_before.KDA아리;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new KDA아리();
        kda아리.skillQ();
        kda아리.skillR();
    }
}
