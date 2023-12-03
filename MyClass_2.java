public class MyClass_2 {
  public static void main(String[] args) {
    // printMyName("Harsh");

    // double x = areaOfCircle(10);
    // System.out.println("Area of cicle: " + x);

    // String myName = getMyName("Harsh");
    // String myName2 = getMyName(myName);

    // System.out.println("My Name: " + myName);
    // System.out.println("My Name 2: " + myName2);

    // int input = 11;

    // for (int i = 1; i <= input; i++) {
    // boolean x = isPrime(i);
    // if (x) {
    // System.out.println(i);
    // }
    // }
  }

  static void printMyName(String name) {
    System.out.println("Hello " + name);
    return;
  }

  static String getMyName(String name) {
    return "Hello " + name;
  }

  static double areaOfCircle(int radius) {
    return Math.PI * radius * radius;
  }

  static boolean isPrime(int num) {

    boolean isPrime = true;

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    return isPrime;
  }

}

// f(x)=3.14*x*x;
// f(1)=3.14*1*1;
// f(10)=3.14*10*10;
