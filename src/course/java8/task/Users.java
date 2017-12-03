package course.java8.task;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Users {
    int id;
    int age;
    String name;
    boolean sex;
    int salary;
    String city;
    String department;

    public static void main(String[] args) {
        List<Users> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Users());
            if (i % 2 == 0) list.get(i).city = "kiev";
            else list.get(i).city = "asdkiev";
        }

        System.out.println(liveInCity(list, "kiev"));

    }


    public List<Users> find(List<Users> users, String city, int age1, int age2 ) {

        return users.stream().filter(user ->
                (!user.sex && user.city.equals(city) &&
                        user.age > age1 && user.age < age2)).
                sorted(Comparator.comparingInt(o -> o.age)).
                collect(Collectors.toList());
    }

    public List<Users> getFirstThreeTopUsers(List<Users> users) {
        return users.stream().sorted(Comparator.comparingInt(o -> o.salary)).
                limit(3).collect(Collectors.toList());
    }

    public List<Users> sumOfCityUsers(List<Users> users, String city, String startName) {
        return users.stream().filter(user ->
                (user.city.equals(city) && user.name.startsWith(startName))).
                collect(Collectors.toList());
    }

    public void addPercentToSalary(List<Users> users, int percent) {
        users.stream()
                .peek(user -> user.salary = user.salary * (percent + 100)).
                forEach(Users::pr);
    }

    private static void pr(Users s) {
        System.out.printf("id= %d, name= %s, salary= %d", s.id, s.name, s.salary);
    }

    public static long liveInCity(List<Users> users, String city) {
        return users.stream().filter(user -> user.city.equals(city)).count();
    }

    public static double avarageSalaryCity(List<Users> users, String city) {
        List<Users> filtered = users.stream().filter(user -> user.city.equals(city)).collect(Collectors.toList());
        long sum = filtered.stream().mapToInt(u -> u.salary).sum();
        return sum/filtered.size();
    }

}
