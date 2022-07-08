import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Array lists to store Course, Student and Tutor class objects
        ArrayList<Course> allCourses = new ArrayList<>();
        ArrayList<Student> allStudents = new ArrayList<>();
        ArrayList<Tutor> allTutors = new ArrayList<>();

        Scanner userinput = new Scanner(System.in);
        int choice = 0;

        //main program starts, end if the user enter the number 8
        while (choice!=8) {
            mainMenu();
            choice = userinput.nextInt();
            switch (choice) {
                case (1):
                    //prints an overview of all students, courses and tutors
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
                    // creates a new Student class object and adds it to the Student ArrayList
                    Student newStudent = new Student();
                    newStudent.addStudent();
                    allStudents.add(newStudent);
                    break;
                case (3):
                    // creates a new Tutor class object and adds it to the Tutor ArrayList
                    Tutor newTutor = new Tutor();
                    newTutor.addTutor();
                    allTutors.add(newTutor);
                    break;
                case (4):
                    // creates a new Course class object and adds it to the Course ArrayList
                    Course newCourse = new Course();
                    newCourse.addCourse();
                    allCourses.add(newCourse);
                    break;
                case (5):
                    //Removes a student based on the order all Student class objects were created and added in
                    System.out.println("Type in the number corresponding the student: ");
                    choice = userinput.nextInt();
                    //Takes into account the fact that user will not know to use 0 as an index value
                    allStudents.remove(choice-1);
                    break;
                case (6):
                    //Removes a tutor based on the order all Tutor class objects were created and added in
                    System.out.println("Type in the number corresponding the tutor: ");
                    choice = userinput.nextInt();
                    //Takes into account the fact that user will not know to use 0 as an index value
                    allTutors.remove(choice-1);
                    break;
                case (7):
                    //Removes a course based on the order all Course class objects were created and added in
                    System.out.println("Type in the number corresponding the course: ");
                    choice = userinput.nextInt();
                    //Takes into account the fact that user will not know to use 0 as an index value
                    allCourses.remove(choice-1);
                    break;
            }
        }

    }
    //Display the main menu
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
