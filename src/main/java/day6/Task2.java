package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane boing = new Airplane("The Boeing Company", 1980, 11.15, 27.700);
        boing.info();
        System.out.println();
        boing.setYear(1985);
        boing.setLength(11.25);
        boing.info();
        System.out.println();
        boing.fillUp(123);
        boing.fillUp(566.5);
        boing.info();

    }
}

class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    };

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public double getFuel(){
        return fuel;
    }

    public Airplane(String manufacturer, int year, double length, double weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    void info(){
        System.out.println("Изготовитель: " + manufacturer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Длина: " + length);
        System.out.println("Вес: " + weight);
        System.out.println("Количество топлива в баке: " + fuel);
    }
    double fillUp(double n){
        this.fuel += n;
        return this.fuel;
    }
}