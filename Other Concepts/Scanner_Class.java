import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {

        // Instantiating Scanner class with object named sc
        Scanner sc = new Scanner(System.in);

        // Here we are taking the user input of age
        System.out.println("Enter your age");
        byte age = sc.nextByte();
        System.out.println("Your age is " + age);

        // Here we are taking the user input of name
        System.out.println("Enter your name");
        String name = sc.next(); // nextline is used to read spaces between strings

        System.out.println("Your name is " + name);

        sc.close(); // Closing the Scanner class

    }
}
