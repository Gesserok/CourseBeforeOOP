package course.codingBat;


import course.codingBat.warmUp1.IcyHot;
import course.codingBat.warmUp1.StartHi;

public class Main {
    public static void main(String[] args) {

        StartHi st = new StartHi();
        System.out.println(st.startHi("hi asd"));

        IcyHot icyHot = new IcyHot();
        System.out.println(icyHot.icyHot(-1, 120));
        System.out.println(icyHot.icyHot(120, -1));
        System.out.println(icyHot.icyHot(-1, 99));
        System.out.println(icyHot.icyHot(99, -1));
        System.out.println(icyHot.icyHot(120, 120));
    }


}
