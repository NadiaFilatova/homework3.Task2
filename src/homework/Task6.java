package homework;


import java.util.Scanner;

//Опишіть метод PowerA234(A, B, C, D), який обчислює другий,
// третій і четвертий ступінь числа A і повертає ці ступені відповідно до змінних B, C і D
// (A – вхідний, B, C, D – вихідні параметри; усі параметри є дійсними).
// За допомогою цієї процедури знайдіть другий, третій і четвертий ступені п'яти зазначених чисел.
public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            float A = scanner.nextFloat();
            System.out.println(PowerA234(A));
        }
    }

    public static Object PowerA234(float A) {
        float B = (float) Math.pow(A, 2);
        float C = (float) Math.pow(A, 3);
        float D = (float) Math.pow(A, 4);
        return "  другий ступінь " + B + "  третій ступінь " + C + "  четверний ступінь " + D;
    }

}

