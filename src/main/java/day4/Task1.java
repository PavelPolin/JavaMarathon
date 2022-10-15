package day4;
import java.util.Scanner;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число");
        int arrayLength = console.nextInt();
        int[] array = new int[arrayLength];
        for (int x: array) {
            array[x] = random.nextInt(10 + 1);
        }
        int big = 0;
        int one = 0;
        int even = 0;
        int sum = 0;
        for(int x: array){
            if (x % 2 == 0)
                even++;
            if (x > 8)
                big++;
            if (x == 1)
                one++;
            sum += array[x];
            System.out.print(array[x] + " ");
        }
        int odd = arrayLength - even;
        System.out.println();
        System.out.println("Длина массива равна: " + arrayLength);
        System.out.println("Количество чисел больше 8: " + big);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество чётных чисел: " + even);
        System.out.println("Количество нечётных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
