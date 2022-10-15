package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа через пробел");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = a + 1;
        if (a >= b){
            System.out.println("Ошибка ввода");
        } else{
            System.out.println("Всё, что делится на 5, но не делится на 10, в промежутке между заданными числами:");
            while (i < b) {
                if (((i % 5) == 0) && ((i % 10) != 0))
                    System.out.print(i + " ");
                i++;
            }
        }
    }
}
