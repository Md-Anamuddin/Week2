
class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    // Constructor
    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student(
            101, "Rahul", 21, "Java Programming"
        );

        Student student2 = new Student(
            102, "Priya", 20, "Computer Science"
        );

        System.out.println("----- Student 1 -----");
        student1.displayInfo();

        System.out.println("\n----- Student 2 -----");
        student2.displayInfo();
    }
}
