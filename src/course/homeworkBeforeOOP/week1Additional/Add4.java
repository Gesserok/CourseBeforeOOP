package course.homeworkBeforeOOP.week1Additional;


//4) Известны две скорости, одна в километрах в час, другая в метрах в секун-
//        ду. Какая из них больше?

public class Add4 {

    public static void main(String[] args) {

        double speedHour = 0;
        int speedSec = 100;

        if (speedHour > speedToHour(speedSec)) {
            System.out.println("speedHour > speedSec");
        } else if (speedHour < speedToHour(speedSec)) {
            System.out.println("speedHour < speedSec");
        } else System.out.println("speedHour = speedSec");
    }
    private static double speedToHour (double i) {
        return i*3600.0 /1000.0;
    }
}
