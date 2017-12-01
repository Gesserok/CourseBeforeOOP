package course.java8.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.Chronology;
import java.time.temporal.ChronoField;

public class TestJava8 {

    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(1985, 9, 9);
        LocalDate localDate2 = LocalDate.now();

        int i = localDate1.get(ChronoField.DAY_OF_WEEK);
        System.out.println(i);

    }
}
