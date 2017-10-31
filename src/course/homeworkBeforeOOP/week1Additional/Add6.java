package course.homeworkBeforeOOP.week1Additional;


//6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания

import java.util.Scanner;

public class Add6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a speed in km per hour");
        int speed = scanner.nextInt();
        System.out.println("Enter a distance in meters");
        int distance = scanner.nextInt();
        int seconds = (int)(distance/((double)speed*1000.0/3600.0));
        if (seconds<60) {
            System.out.println("Finish after " + seconds + " seconds");
        } else if (seconds >= 60 && seconds < 3600){
//                System.out.println("Finish after " + seconds/60 + " minutes and " + seconds + " seconds");
        } else {
//            System.out.println("Finish after " + seconds / 3600 + " hours and " + seconds 60 + " minutes and " + seconds % 3600 + " seconds");
        }
    }
}
