package day4;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        int index = 0;
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println(index);
    }
}
