package course.homeworkBeforeOOP.week3.json_classwork;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private int count;
    private List<Student> list;

    public Group(){
        this.name = "FI21";
        this.count = 10;
        this.list = new ArrayList<Student>();
    }

    public Group(String name, int count, List list){
        this.name = "FI21";
        this.count = 10;
        this.list = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
}
