import java.util.Scanner;

// In this lesson we are learning how to get user input

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // This reads the user input and saves to a variable name in this case
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // nextLine saves the spaces as well if you dont want the space just use "next"


        // To read a integer
        System.out.print("Enter your age ?" );
        int age = scanner.nextInt();


        // If you want to print a double
        System.out.print("what is your gpa: ");
        double gpa = scanner.nextDouble();

        // If you need a boolean
        System.out.print("Are you a student? (true/false): ");
        boolean  isStudent = scanner.nextBoolean();

        // lets add a if statement to student
        if (isStudent) {
            System.out.println("Welcome Back student!");
        } else {
            System.out.println("Your are not a student Bye Bye ");
        }

        // Print Statements
        System.out.println("Hello " + name);
        System.out.println("Your age is: " + age + " Years old ");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Student: " + isStudent);

        // Common issues
        // the next line error , specially in int number and double numbers
        // Example
        System.out.print("Enter your age ?" );
        int ag = scanner.nextInt();
        // To fix this issue we need to clear to space character like this
        scanner.nextLine();


        System.out.print("What is your favorite color ? " );
        String color = scanner.nextLine();

        // Print
        System.out.println("Your age is: " + ag + " Years old ");
        System.out.println("Your color is : " + color );



        scanner.close();

    }
}
