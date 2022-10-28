package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 5),
                new Circle("Blue",5 )
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }
    public static double calculateRedArea(Figure[] figures){
        String color = "Red";
        double redArea = 0;
        for (int i = 0; i < figures.length; i++) {
            if (color.equals(figures[i].getColor())){
                redArea += figures[i].area();
            }
        } return redArea;
    }
    public static double calculateRedPerimeter(Figure[] figures){
        String color = "Red";
        double redPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            if (color.equals(figures[i].getColor())){
                redPerimeter += figures[i].perimeter();
            }
        } return redPerimeter;
    }
}

abstract class Figure{
    private String color;
    public String getColor(){
        return color;
    }
    public Figure(String color){
        this.color = color;
    }
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Figure{
    private double radius;
    public double getRadius(){
        return radius;
    }
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public double area() {
        return (Math.PI * Math.pow(radius, 2));
    }
    @Override
    public double perimeter() {
        return (2 * Math.PI * radius);
    }
}

class Rectangle extends Figure{
    private double height;
    private double width;
    public Rectangle(String color, double height, double width){
        super(color);
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return height * width;
    }
    @Override
    public double perimeter() {
        return (2 * (height + width));
    }
}
class Triangle extends Figure{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(String color, double side1, double side2, double side3){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double area() {
        double semiPerimetr = perimeter() / 2;
        return Math.sqrt(semiPerimetr * (semiPerimetr - side1) * (semiPerimetr - side2) * (semiPerimetr - side3));
    }
    @Override
    public double perimeter() {
        return (side1 + side2 + side3);
    }
}

