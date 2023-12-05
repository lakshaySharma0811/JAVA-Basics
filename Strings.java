public class Strings {

  public static void main(String[] args) {

    // 1. Concatenation

    // google-drive/documents/harsh/dmc.jpg
    // google-drive/documents/lakshay/12th-dmc.jpg
    String basePath = "google-drive/documents";
    String name = "harsh";
    String fileName = "10th.jpg";

    String finalPath = basePath + "/" + name + "/" + fileName;
    System.out.println("Concatenation: " + finalPath);

    // 2. length
    String myName = "Harsh Soni";
    int stringLength = myName.length();
    System.out.println("Length: " + stringLength);

    // 3. Specific string char by position
    String randomString = "This is my string";
    char x = randomString.charAt(15);
    System.out.println(x);

    // 4. String to number
    String y = "11569";

    int num = Integer.parseInt(y) + 1;
    System.out.println("String to Int: " + num);

    String xy = String.valueOf(y);
    System.out.println("Int to String: " + xy);

    // 5. String loop

  }
}
