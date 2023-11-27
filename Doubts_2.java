import java.util.Scanner;

public class Doubts {
  // public static void main(String[] args) {

  // Scanner input = new Scanner(System.in); // object

  // System.out.print("Enter First Number: "); // string 1
  // int firstNumber = input.nextInt(); // input 1

  // System.out.print("Enter Second Number: "); // string 2
  // int secondNumber = input.nextInt(); // input 2

  // System.out.print("Enter Third Number: "); // string 3
  // int thirdNumber = input.nextInt(); // input 3

  // input.close();

  // if (firstNumber > secondNumber && firstNumber > thirdNumber) {
  // System.out.println("First number is greater that second and third");
  // } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
  // System.out.println("Second number is greater that first and third");
  // } else {
  // System.out.println("Third number is greater that first and second");
  // }

  // }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Number: ");
    int number = input.nextInt();
    int result = 0;
    int tempNum = 0;

    // do {
    // result = result + tempNum++;
    // } while (tempNum <= number);

    // while (tempNum <= number) {
    // result += tempNum++;
    // }

    for (int num = 0; num <= number; num++) {
      result += num;
    }

    System.out.println("Sum of first " + number + " number: " + result);

    input.close();

  }
}

//
