import java.util.Scanner;
public class Course {
    private String name;
    private String level;
    private int sessions;

    private Scanner crs = new Scanner(System.in);

    public Course() {
    }

    public void addCourse() {
        System.out.print("\nCourse name: ");
        name = crs.nextLine();
        System.out.print("Course level: ");
        level = crs.nextLine();
        System.out.print("Length in one hour sessions: ");
        sessions = crs.nextInt();
    }

    public void printCourse() {
        System.out.println("Name: " + name + " ; level: " + level + " ;needed sessions: " + sessions);
    }
}

