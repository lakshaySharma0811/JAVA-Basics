import java.util.Scanner;

public class DecimalToBinary {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    sc.close();

    // String result = "";
    int result = 0; // 0

    int i = 1; // 1000

    while (num > 0) {
      int rem = num % 2; // 1 % 2 = 1

      result = result + rem * i; // 0 + 1 * 10000 = 10000

      i = i * 10; // 1000 * 10 = 10000

      num = num / 2; // 0
    }

    System.out.println(result);
  }
}

// 110 = 1 * (2 ^ 2) + 1 * (2 ^ 1) + 0 * (2 ^ 0) = 6
