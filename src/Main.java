import java.util.*;

public class Main {
    public static void main(String[] args) {


        int currentyear = 2024; //for calculation
        Scanner scanner = new Scanner(System.in); //creating a scanner instance
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); //for string input
        System.out.println("Your name is "+name);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); //for int input
        int birthyear = currentyear - age; //subtracting age from current year
        System.out.println("Your birth year is "+birthyear);

        System.out.println("Hello, "+name+". Your birth has made "+birthyear+" a special year!");


    }
}
