package day6;
public class Task1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setModel("Vesta");
        lada.setColor("black");
        lada.setYear(2017);
        lada.info();
        System.out.println("Модель: " + lada.getModel());
        System.out.println("Цвет: "+ lada.getColor());
        System.out.println("Год выпуска: " + lada.getYear());
        int age = lada.yearDifference(2022);
        System.out.println("Машине уже " + age + " лет");
    }
}
