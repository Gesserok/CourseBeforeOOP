package course.homeworkBeforeOOP.week1Additional;

//8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
//        тавляется, если сумма покупки превышает 1000 гривен.


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Add8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Стоимость товара, грн");
        double cost = scanner.nextDouble();
        if (cost > 1000) {
            BigDecimal bd = new BigDecimal(cost-cost/10);
            BigDecimal bd1 = new BigDecimal(cost*0.9);

            System.out.println(bd);
            System.out.println(bd1);

            bd = bd.setScale(2, RoundingMode.HALF_UP);
            bd1 = bd1.setScale(2, RoundingMode.HALF_EVEN);
            System.out.println("Стоимость с учетом скидки - " + bd);
            System.out.println("Стоимость с учетом скидки - " + bd1);
        } else {
            System.out.println("Скидка не предоставляется");
        }
    }
}
