import java.util.Scanner;  // import the package

public class input {
    public static void main(String[] args) {
        Scanner load = new Scanner(System.in);  // Create an object of scanner

        System.out.print("Enter the number: ");  // Just print the string

        int number = load.nextInt();  // Take input from the user

        System.out.print("Your number is " + number);  // It will print the output

        load.close();
    }
}
