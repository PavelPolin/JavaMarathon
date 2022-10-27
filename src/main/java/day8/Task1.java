package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i <= 20000 ; i++) {
            s1 = s1 + i + " ";
        }
        System.out.println(s1);
        long stopTime = System.currentTimeMillis();
        System.out.print("Длительность работы, в мс: ");
        System.out.println(stopTime - startTime);
        System.out.println();


        long start2Time = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i <= 20000 ; i++) {
            s2.append(i + " ");
        }
        System.out.println((s2.toString()));
        long stop2Time = System.currentTimeMillis();
        System.out.print("Длительность работы, в мс: ");
        System.out.print(stop2Time - start2Time);
    }
}
