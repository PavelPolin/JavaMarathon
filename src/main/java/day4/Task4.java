package day4;
import java.util.Random;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        int sum = 0;
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < 3)
                sum = sum + array[i];
            if ( i == 2)
                maxSum = sum;
            if (i > 2) {
                sum = sum + array[i] - array[(i - 3)];
                if (sum > maxSum) {
                    maxSum = sum;
                    index = i - 2;
                }
            }
        }
        String intArrayString = Arrays.toString(array);
        System.out.println(intArrayString);
        System.out.print(maxSum);
        System.out.println(index);
    }
}
