public class BreakKeyword {

  public static void main(String[] args) {

    // break: This keyword is used to terminate the current iteration.
    // continue: This keyword is used to skip the current iteration.

    for (int i = 1; i <= 10; i++) {
      System.out.println("First Loop Started!! " + i);

      for (int j = 1; j <= 10; j++) {
        // if (j % 2 == 0) {
        // continue;
        // }
        if (j % 2 == 0) {
          break;
        }

        // System.out.println("Number is: " + i);
        // System.out.println("I am after the continue statement!");
        System.out.println("I am Second loop!! " + j);
      }

      System.out.println("First Loop Ended!! ");
    }

  }
}
