package day3;
import  java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    for (int i = 0; i < 5; i++){
        System.out.println("Введите 2 числа");
        double x = console.nextDouble();
        double y = console.nextDouble();
        if (y == 0) {
            System.out.println("Деление на 0");
            continue;
        }
        System.out.println("Результат деления равен: " + (x / y));
        }
    }
}
