package course.homeworkBeforeOOP.week3.json_classwork;


import java.util.Date;


public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Anton");
        s1.setBirth(new Date());
        s1.setTaskCount(10);
        s1.setRank(4);


//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Student s2 = new Student();
        s2.setName("Vasia");
        s2.setBirth(new Date());
        s2.setTaskCount(6);
        s2.setRank(1);


        Group group1 = new Group();
        group1.getList().add(s1);
        group1.getList().add(s2);

//        System.out.println(GroupJsonUtils.studentToJson(s1));
//        System.out.println(GroupJsonUtils.listToJson(group1.getList()));
        System.out.println(GroupJsonUtils.groupToJson(group1));
/*
        Group groupNew = jsonToGroup(GroupJsonUtils.groupToJson(group1));
        System.out.println(groupNew.getName());
        System.out.println(groupNew.getCount());
        for (Student x : groupNew.getList()) {
            System.out.println(x.getName());
            System.out.println(x.getBirth());
            System.out.println(x.getRank());
            System.out.println(x.getTaskCount());

        }
*/
//        String str = GroupJsonUtils.jsonToListString("{ \"GroupName\" : \"FI21\", \"count\" : 10, \"list\" : [ { \"name\" : \"Anton\", \"birth\" : \"Mon Oct 30 10:35:55 EET 2017\", \"taskCount\" : 10, \"rank\" : 4}, { \"name\" : \"Vasia\", \"birth\" : \"Mon Oct 30 10:35:55 EET 2017\", \"taskCount\" : 6, \"rank\" : 1}] }");
//        System.out.println(str);
//        System.out.println(GroupJsonUtils.jsonToStudent(str)[0]);
//        System.out.println(GroupJsonUtils.jsonToStudent(str)[1]);










    }
}
