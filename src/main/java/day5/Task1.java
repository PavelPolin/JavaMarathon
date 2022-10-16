package day5;

public class Task1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setModel("Vesta");
        lada.setColor("black");
        lada.setYear(2017);
        System.out.println("Модель: " + lada.getModel());
        System.out.println("Цвет: "+ lada.getColor());
        System.out.println("Год выпуска: " + lada.getYear());

    }
}

class Car{
    private String model;
    private String color;
    private int year;

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