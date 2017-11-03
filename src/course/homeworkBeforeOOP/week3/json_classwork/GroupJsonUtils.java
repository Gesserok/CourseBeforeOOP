package course.homeworkBeforeOOP.week3.json_classwork;

import java.util.ArrayList;
import java.util.List;

public class GroupJsonUtils {
    public static List<Integer> openBrace = new ArrayList<Integer>();
    public static List<Integer> closeBrace = new ArrayList<Integer>();
    public static List<Integer> openBraceArr = new ArrayList<Integer>();
    public static List<Integer> closeBraceArr = new ArrayList<Integer>();

    public static String studentToJson(Student student) {

        return String.format(" { \"name\" : \"%s\", \"birth\" : \"%s\", \"taskCount\" : %d, \"rank\" : %d}",
                                            student.getName(), student.getBirth(), student.getTaskCount(), student.getRank());
    }

    public static String listToJson (List<Student> list) {
        String line = "[";
        if (!list.isEmpty() && list != null && list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                line += String.format("%s,", GroupJsonUtils.studentToJson(list.get(i)));
            }
            line = line.endsWith(",") ? line.substring(0, line.length() - 1) : line;

            return line += "]";
        } else return line;
    }

    public static String groupToJson (Group group) {
        return String.format(" { \"GroupName\" : \"%s\", \"count\" : %d, \"list\" : %s }", group.getName(), group.getCount(), GroupJsonUtils.listToJson(group.getList()));
    }


    public static String jsonToListString(String str) {
        if (!str.isEmpty() || str != null) {
            str = str.substring(str.indexOf('[')+1, str.indexOf(']'));
        } else str = "";
//        System.out.println("jsonToListString " + str);
        return str;
    }

    public static String[] jsonToStudent (String str) {
        String[] studentsString = str.split("},");
        return studentsString;
    }




}
