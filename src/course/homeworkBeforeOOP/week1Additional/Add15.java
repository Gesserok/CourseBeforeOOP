package course.homeworkBeforeOOP.week1Additional;

//15) Известны площади круга и квадрата. Определить: а) уместится ли круг в
//        квадрат; б) уместится ли квадрат в круге.

public class Add15 {
    public static void main(String[] args) {

        double squear0 = 4;
        double squear = 1;

        double side = Math.sqrt(squear);
        System.out.println("Сторона квадрата - " + side);

        double diam = 2*Math.sqrt(squear0/(2*Math.PI));
        System.out.println("Диаметр круга - " + diam);

        double diagon = Math.sqrt(2*side*side);
        System.out.println("Диагональ квадрата - " + diagon);

        if (side >= diam) {
            System.out.println("Круг в квадрате");
        } else if (diam >= diagon){
            System.out.println("Квадрат в круге");
        } else {
            System.out.println("Не вмещаются");
        }

    }
}
