import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> allCourses = new ArrayList<>();
        ArrayList<Student> allStudents = new ArrayList<>();
        ArrayList<Tutor> allTutors = new ArrayList<>();
        Scanner userinput = new Scanner(System.in);
        int choice = 0;
        while (choice!=8) {
            mainMenu();
            choice = userinput.nextInt();
            switch (choice) {
                case (1):
                    int orderNumber = 1;
                    System.out.println("The courses are\n");
                    for (Course elem : allCourses) {
                        System.out.println("Course number " + orderNumber + " is:");
                        elem.printCourse();
                        orderNumber++;
                    }
                    System.out.println();
                    System.out.println("The students are:\n");
                    orderNumber = 1;
                    for (Student elem : allStudents) {
                        System.out.println("Student number " + orderNumber + " is:");
                        elem.printStudent();
                        orderNumber++;
                    }
                    System.out.println();
                    System.out.println("The tutors are:\n");
                    orderNumber = 1;
                    for (Tutor elem:allTutors) {
                        System.out.println("Tutor number " + orderNumber + " este:");
                        elem.printTutor();
                        orderNumber++;
                    }
                    break;
                case (2):
                    Student newStudent = new Student();
                    newStudent.addStudent();
                    allStudents.add(newStudent);
                    break;
                case (3):
                    Tutor newTutor = new Tutor();
                    newTutor.addTutor();
                    allTutors.add(newTutor);
                    break;
                case (4):
                    Course newCourse = new Course();
                    newCourse.addCourse();
                    allCourses.add(newCourse);
                    break;
                case (5):
                    System.out.println("Type in the number corresponding the student: ");
                    choice = userinput.nextInt();
                    allStudents.remove(choice-1);
                    break;
                case (6):
                    System.out.println("Type in the number corresponding the tutor: ");
                    choice = userinput.nextInt();
                    allTutors.remove(choice-1);
                    break;
                case (7):
                    System.out.println("Type in the number corresponding the course: ");
                    choice = userinput.nextInt();
                    allCourses.remove(choice-1);
                    break;
            }
        }

    }
    public static void mainMenu() {
        System.out.println("--------------------------------");
        System.out.println("Welcome to your tutoring school\n" + "What would you like to do?\n");
        System.out.println("1) Overview");
        System.out.println("2) Add student");
        System.out.println("3) Add Tutor");
        System.out.println("4) Add course");
        System.out.println("5) Remove student");
        System.out.println("6) Remove Tutor");
        System.out.println("7) Remove course");
        System.out.println("8) Quit\n");
        System.out.print("Enter a choice: ");
    }
}
