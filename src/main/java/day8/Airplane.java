package day8;

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
    public void fillUp(double n){
        fuel += n;
    }
    public String toString(){
        String info = "Изготовитель: " + manufacturer + "\n" + "Год выпуска: " + year + "\n" + "Длина: " + length + "\n" + "Вес: " + weight + "\n" + "Количество топлива в баке: " + fuel;
        return info;
    }
}