import java.util.Scanner;
public class BinaryToDecimal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    sc.close();

    int result = 0;

    int i = 1;

    while (num > 0) {
      int rem = num % 10;
      result = result + rem * i;

      i = i * 2;
      num = num / 10;
    }

    System.out.println(result);
  }
}
