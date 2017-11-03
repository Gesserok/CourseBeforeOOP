package course.homeworkBeforeOOP.week3.homework310.worddelete;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HomeWork310 {

    public static Map<String, Integer> map = new LinkedHashMap<String, Integer>();

    public static void main(String[] args) {

        System.out.println(wordsDelete("Мама мыла раму мыла раму мама папа раму мыл"));

    }

    public static String wordsDelete(String s) {
        String[] strings = s.split(" ");

        for (String x : strings) {
            if (!map.isEmpty()) {
                if (!map.containsKey(x)) {
                        map.put(x, 1);
                } else {
                    for (Map.Entry pair : map.entrySet()) {
                        if (pair.getKey().equals(x)) {
                            pair.setValue((int)pair.getValue()+1);
                        }
                    }
                }
            } else map.put(x, 1);
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() > 1) {
                iterator.remove();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry pair : map.entrySet())  {
            sb.append(pair.getKey()).append(" ");
        }
        return sb.substring(0, sb.length()-1);
    }
}
