package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Василий", "Технологические машины и оборудование");
        Teacher teacher1 = new Teacher("Геннадий", "Физика");
        System.out.println(student1.getGroupName());
        System.out.println(teacher1.getSubjectName());
        student1.printInfo();
        teacher1.printInfo();
    }
}
class Human{
    private String name;
    public String getName(){
        return name;
    }
    public Human(String name){
        this.name = name;
    }
    public void printInfo(){
        System.out.println("Этот человек с именем " + name);
    }
}

class Student extends Human{
    private String groupName;
    public String getGroupName(){
        return groupName;
    }
    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;
    }
    public void printInfo(){
        System.out.println("Этот человек с именем " + super.getName());
        System.out.println("Этот студент с именем " + getName());
    }
}

class Teacher extends Human{
    private String subjectName;
    public String getSubjectName(){
        return subjectName;
    }
    public Teacher(String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }
    public void printInfo(){
        System.out.println("Этот человек с именем " + super.getName());
        System.out.println("Этот преподаватель с именем " + getName());
    }
}


