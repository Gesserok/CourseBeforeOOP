package course.homeworkBeforeOOP.week1;

import course.homeworkBeforeOOP.NumericClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
//        5678  -   1
//        5889  -   2
//        8888  -   4
//        989990  - 1


public class HomeWork53 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = new String();
        try {
            do {
                s = reader.readLine();
            } while (!NumericClass.isInteger(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int kol=0;
        for (int i = 0; i < s.length(); i++) {
            if (Integer.parseInt(String.valueOf(s.charAt(i)))%8 == 0) {
                kol++;
            }
        }
        System.out.println(s + " - " + kol);
    }


}
