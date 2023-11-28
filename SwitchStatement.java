import java.util.Scanner;

public class SwitchStatement {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int statusCode = sc.nextInt();

    sc.close();

    String message = "NONE";

    // if (statusCode == 0) {
    // message = "API Failed";
    // System.out.println("API Failed");
    // } else if (statusCode == 1) {
    // message = "API Success";
    // System.out.println("API Success");
    // } else if (statusCode == 2) {
    // message = "API Redirected";
    // System.out.println("API Redirected");
    // } else if (statusCode == 3) {
    // message = "Bad Request";
    // System.out.println("Bad Request");
    // } else if (statusCode == 4) {
    // message = "Server Error";
    // System.out.println("Server Error");
    // }

    // Switch Statement
    switch (statusCode) {
      case 0:
        message = "API Failed";
        System.out.println("Case 1 Excuted!");
        break;
      case 1:
        message = "API Success";
        System.out.println("Case 2 Excuted!");
        break;
      case 2:
        message = "API Redirected";
        System.out.println("Case 3 Excuted!");
        break;
      default:
        message = "This status code is not handled";
        System.out.println("Default Excuted!");
        break;
    }

    System.out.println("Final Message: " + message);
  }
}
