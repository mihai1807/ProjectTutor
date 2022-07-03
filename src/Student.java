import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private int contactInfo;
    private Scanner std = new Scanner(System.in);

    public Student() {
    }

    public void  addStudent() {
        System.out.print("\nStudent Name: ");
        name = std.nextLine();
        System.out.print("Student Age: ");
        age = std.nextInt();
        System.out.print("Student phone number: ");
        contactInfo = std.nextInt();
    }

    public void printStudent () {
        System.out.println("Name: " + name + " ;age: " + age + " ;phone number: " + contactInfo);
    }
}

