package course.homeworkBeforeOOP.week3.json_classwork;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class GroupJsonUtils {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
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

/*
    public static Group jsonToGroup(String str) {
              return GSON.fromJson(str, Group.class);
    }
    public static Student jsonToStudent (String str) {
        if (str.contains("[")) {
            str = str.substring(str.indexOf("["), str.indexOf("]"));
        }
        String[] studentString = str.split(",");
        for (String x : studentString) {

        }
        return new Student();

    }
*/





}
