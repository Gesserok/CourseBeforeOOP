package course.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        for (Integer number : numbers) {
            number.doubleValue();
        }

    }
}
