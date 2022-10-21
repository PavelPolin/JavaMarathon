package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("The Boeing Company", 2000, 11.15, 27.000);
        Airplane a2 = new Airplane("The Boeing Company", 2002, 11.15, 27.000);
        Airplane a3 = new Airplane("The Boeing Company", 2010, 10.25, 27.000);
        Airplane.compareAirplanes(a1, a2);
        Airplane.compareAirplanes(a1, a3);
        Airplane.compareAirplanes(a3, a2);
    }
}