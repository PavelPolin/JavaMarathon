package day3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("Введи 2 числа");
            double x = console.nextDouble();
            double y = console.nextDouble();
            if (y == 0) {
                System.out.println("Нельзя делить на 0! Ты всё сломал!");
                break;
            } else {
                System.out.println("Результат деления: " + (x / y));
            }
        }
    }
}
