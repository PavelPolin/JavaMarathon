package day5;


public class Task2 {
    public static void main(String[] args) {
    Motorbike honda = new Motorbike("CBR650R", "red", 2022);
    System.out.println("Модель: " + honda.getModel());
    System.out.println("Цвет: " + honda.getColor());
    System.out.println("Год выпуска: " + honda.getYear());
    }
}

class Motorbike{
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
