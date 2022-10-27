package day6;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
    Teacher petrov = new Teacher("Петров", "математика");
    Student student1 = new Student();
    student1.setName("Алексей Макаров");
    Student student2 = new Student();
    student2.setName("Иван Дурин");
    System.out.println(petrov.evaluate(student1.getName()));
    System.out.println(petrov.evaluate(student2.getName()));
    }
}

class Teacher{
    Random random = new Random();
    private String name;
    private String subject;

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public String evaluate(String studentName){
        int number = random.nextInt(5 + 2);
        String evaluation;
        switch (number){
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
            default:
                evaluation = "неудовлетворительно";
        }
      return ("Преподователь " + getName() + " оценил студента с именем " + studentName + " по предмету " + getSubject() + "на оценку " +  evaluation);
    }
}

class Student{
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}