package homework;

import java.util.Scanner;

//Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate,
// який приймає як параметри три цілих аргументи та виводить на екран середнє арифметичне значень аргументів.
public class Calculator {
     public static void main( String[]args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ввведіть число №1");
         int a = scanner.nextInt();
         System.out.println("Ввведіть число №2");
         int b = scanner.nextInt();
         System.out.println("Ввведіть число №3");
         int c = scanner.nextInt();
         calculate(a,b,c);
     }
     public static void calculate( int a,  int b, int c ){
         System.out.println( (float) (a+b+c) / 3 + "  - середнє арифметичне значень аргументів");
     }
}
