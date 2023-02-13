package homework;

import java.util.Scanner;

public class Arithmetics {


    public static void main(String[] args) {
        System.out.println("Введіть перше ціле число ");
        Scanner scanner = new Scanner(System.in);
        final float a = scanner.nextFloat();
        System.out.println("Введіть 2-ге ціле число ");
        final float b = scanner.nextFloat();
        System.out.println(" Оберіть вид арифметичної операції: + , * , - ,  /");
        final String o = scanner.next();

        switch (o) {
            case "+" -> System.out.println("a + b = " + add(a, b));
            case "*" -> System.out.println("a - b = " + sub(a, b));
            case " -" -> System.out.println("a * b = " + mul(a, b));
            case "/" -> {
                if (b == 0) {
                    System.out.println(" ділення на нуль неможливе ");
                } else
                    System.out.println("a / b = " + div(a, b));
            }
            default -> System.out.println("Оберіть коректно вид арифметичної операції");
        }
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static float sub(float a, float b) {
        return a - b;
    }

    public static float mul(float a, float b) {
        return a * b;
    }

    public static float div(float a, float b) {
        return (a / b);
    }
}
