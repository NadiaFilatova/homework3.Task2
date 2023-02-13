package homework;
//Опишіть метод PowerA3(A, B), який обчислює третій ступінь числа A і повертає її до змінної B
// (A – вхідний, B – вихідний параметр; обидва параметри є дійсними).
// За допомогою цієї процедури знайдіть третій ступінь п'яти зазначених чисел.

public class Task5 {
     public static void main( String[]args){
         System.out.println(" третій ступінь числа A " +  PowerA3((float) 1.1));
         System.out.println( "третій ступінь числа A " +PowerA3(12));
         System.out.println(" третій ступінь числа A "+ PowerA3(14));
         System.out.println( " третій ступінь числа A "+ PowerA3((float) 121.34));
         System.out.println( " третій ступінь числа A "+ PowerA3(23467));

     }
      public  static  float  PowerA3(float A){
         float B =  (float) Math.pow(A,3);
           return B;
      }
}
