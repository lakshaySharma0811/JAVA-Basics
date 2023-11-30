import java.util.Scanner;

public class  PrimeOrNot{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    sc.close();
    boolean is_prime = true;

    // long count = 0;

    long startTime = System.currentTimeMillis();

    for (long i = 2; i < Math.sqrt(num); i++) {
      if (num % i == 0) {
        is_prime = false;
        break;
      }
    }

    if (!is_prime) {
      System.out.println("Not Prime");
    } else {
      System.out.println("Prime");
    }

    long endTime = System.currentTimeMillis();

    System.out.println("Result found in " + ((endTime - startTime)) + "ms");

  }
}
