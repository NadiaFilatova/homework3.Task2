package homework;

import java.util.Scanner;
//Використовуючи IntelliJ IDEA, створіть клас NumbersCheck. Напишіть метод, який визначатиме:
//1)      чи є введене число позитивним, чи негативним;
//2)      чи є воно простим (використовуйте техніку перебору значень).
//Просте число – це натуральне число, яке ділиться на 1 й саме на себе.
// Щоби визначити просте число чи ні, варто знайти всі його цілі дільники. Якщо дільників більше 2-х, то воно не просте;
//3)      чи ділиться воно на 2, 5, 3, 6, 9 без залишку.
public class NumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        float one = scanner.nextFloat();
        System.out.println("Число є позитивним ? - " + PositivelyNegatively(one));
        Remainder(one);
        PrimeNumber(one);
    }

    public static boolean PositivelyNegatively(float one) {
        return one > 0;
    }

    public static void PrimeNumber(float one) {
        int i, m;
        int flag = 0;
        m = (int) (one / 2);
        if (one == 0 || one == 1) {
            System.out.println(one + " не просте число");
        } else {
            for (i = 2; i <= m; i++) {
                if (one % i == 0) {
                    System.out.println(one + " не просте число");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(one + " Просте число");
            }
        }
    }

    public static void Remainder(float one) {
        String yes = " Ділиться";
        String no = "  НЕ Ділиться";
        if ((one % 2) == 0) {
            System.out.println(" чи ділиться воно на 2 без залишку? " + yes);
        } else {
            System.out.println(" чи ділиться воно на 2 без залишку? " + no);
        }
        if (one % 5 == 0) {
            System.out.println(" чи ділиться воно на 5 без залишку? " + yes);
        } else {
            System.out.println(" чи ділиться воно на 5 без залишку? " + no);
        }
        if (one % 3 == 0) {
            System.out.println(" чи ділиться воно на 3 без залишку? " + yes);
        } else {
            System.out.println(" чи ділиться воно на 3 без залишку? " + no);
        }
        if (one % 6 == 0) {
            System.out.println(" чи ділиться воно на 6 без залишку? " + yes);
        } else {
            System.out.println(" чи ділиться воно на 6 без залишку? " + no);
        }
        if (one % 9 == 0) {
            System.out.println(" чи ділиться воно на 9 без залишку? " + yes);
        } else {
            System.out.println(" чи ділиться воно на 9 без залишку? " + no);
        }
    }
}