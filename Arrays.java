public class Arrays {

  // Basic
  // Declaration
  // Access
  // value at specific index
  // print

  public static void main(String[] args) {

    int[] nums = new int[5];

    String[] strings = new String[5];

    nums[0] = 10;

    nums[4] = 56;

    nums[0] = 5;

    // printArray(nums);

    String x;

    x = "12";

    System.out.println(x);

    // System.out.println();

    strings[1] = "Ram";

    // printArray(strings);
  }

  static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void printArray(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
