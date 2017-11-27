package course.codingBat.recursion1;

public class CountHi {

    public static void main(String[] args) {
        System.out.println(countHi("xxxhixxxxhixxghi"));
    }

    public static int countHi(String str) {

        if (str.length() <= 1 ) return  0;

        int countHi = 0;
        String strCount = str.substring(str.length() - 2, str.length());
        str = str.substring(0, str.length() - 1);
        if (strCount.equals("hi")){
            countHi +=1;
        }

        return countHi += countHi(str);

    }

}
