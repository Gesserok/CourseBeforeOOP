package course.homeworkBeforeOOP.week2;


//2.1 Инвертировать массив (без использования допольнительного массива)

public class HomeWork71 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < (int)((arr.length)/2); i++) {
            int j = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = j;
        }

        for (int x : arr) {
            System.out.println(x);
        }
    }
}
