import java.util.Scanner;

public class MyClass_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    // drawPattern(input);
    // calculateFact(input);
    // System.out.println(isPalindrome(input));
    // System.out.println(evenOrNot(input));
    // reverseTheNumber(input);
    // System.out.println(primeOrNot(input));
    int fact = calculateFact(input);

    System.out.println(fact);
    if (isPalindrome(fact) == "palindrome") {
      System.out.println("palindrome");
    }
    // System.out.println(leapYearOrNot(input));
    sc.close();
  }

  static int calculateFact(int num) {
    int factorial = 1;
    for (int i = num; i >= 1; i--) {
      factorial = factorial * i;
    }
    return factorial;
  }

  static void drawPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    return;
  }

  static String isPalindrome(int num) {
    int result = 0;
    int tempNum = num;
    while (num > 0) {
      int rem = num % 10;
      result = result * 10 + rem;
      num = num / 10;
    }
    if (tempNum == result) {
      return "palindromeesa";
    } else {
      return "not palindrome";
    }
  }

  static boolean evenOrNot(int num) {
    if (num % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  static void reverseTheNumber(int num) {
    int result = 0;
    while (num > 0) {
      int rem = num % 10;
      result = result * 10 + rem;
      num = num / 10;
    }
    System.out.println(result);
    return;
  }

  static boolean primeOrNot(int num) {
    boolean isPrime = true;
    for (int i = 2; i < Math.sqrt(num); i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    return isPrime;

  }

  static boolean leapYearOrNot(int yr) {
    if ((yr % 400 == 0) || yr % 4 == 0 && yr % 100 != 0) {
      return true;
    } else {
      return false;
    }
  }

}
