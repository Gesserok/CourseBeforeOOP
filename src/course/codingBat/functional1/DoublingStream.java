package course.codingBat.functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of integers, return a list where each integer is multiplied by 2.

doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []*/
public class DoublingStream {
    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.add(-10);
        System.out.println(doubling(arrlist));
    }

    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(a -> a*2).collect(Collectors.toList());
    }
}
