package day4;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
    Random random = new Random();
    int[] array = new int[100];
    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(10000);
        }
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int countEndZero = 0;
    int sumEndZero = 0;
    for(int x: array){
        if(x < min)
            min = x;
        if(x > max)
            max = x;
        if(x % 10 == 0){
            countEndZero++;
            sumEndZero += x;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countEndZero);
        System.out.println("Сумма элементов, оканчивающихся на 0: " + sumEndZero);
    }
}
