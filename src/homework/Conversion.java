package homework;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введіть суму гривень");
        float mani = scanner.nextFloat();
        System.out.println("курс конвертації в долар");
        float kon = scanner.nextFloat();
        System.out.println("Сума валюти яку ви бажаєте придбати = " + (mani / kon) + " доларів");

    }
}
