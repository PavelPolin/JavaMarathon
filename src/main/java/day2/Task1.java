package day2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Сколько этажей в доме? Введите число");
    int level = scanner.nextInt();
    if (level > 0 && level < 5){
        System.out.println("Малоэтажный дом");
    } else if (level > 4 && level < 10){
        System.out.println("Среднеэтажный дом");
    } else if (level > 9){
        System.out.println("Многоэтажный дом");
    } else {
        System.out.println("Ошибка ввода");
        }
    }
}
