import java.util.Scanner;

public class Tutor {
    private String name;

    private int contactInfo;
    private int salary;
    private Scanner tut = new Scanner(System.in);

    public Tutor() {
    }
    public void addTutor() {
        System.out.print("\nEnter name: ");
        name = tut.nextLine();
        System.out.print("Enter phone number: ");
        contactInfo = tut.nextInt();
        System.out.print("Enter salary in USD: ");
        salary = tut.nextInt();
    }
     public void printTutor() {
         System.out.println("Name: " + name + " ;phone number: "+contactInfo+" ;salary: "+salary + "USD");
     }

}
