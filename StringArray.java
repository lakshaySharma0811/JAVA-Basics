public class StringArray {
  public static void main(String[] args) {
    // int[] posArr = { 2, 0, 1, 3, 4 };
    // String result = arrangeWords("ARHSH", posArr);
    // System.out.println(result);

    // String result = mergeWords("abcdsadasd", "def");
    // System.out.println(result);

  }

  static String arrangeWords(String str, int[] positions) {
    String result = "";

    String[] inputStrArray = str.split("");

    for (int i = 0; i < positions.length; i++) {
      int num = positions[i];
      String character = inputStrArray[num];
      result = result + character;
    }

    return result;
  }

  static String mergeWords(String word1, String word2) {
    String result = "";
    int maxLength = 0;
    int word1Length = word1.length();
    int word2Length = word2.length();

    if (word1Length > word2Length) {
      maxLength = word1Length;
    } else {
      maxLength = word2Length;
    }

    for (int i = 0; i < maxLength; i++) {
      String word1Char = "";
      if (i < word1Length) {
        word1Char = String.valueOf(word1.charAt(i));
      }

      String word2Char = "";
      if (i < word2Length) {
        word2Char = String.valueOf(word2.charAt(i));
      }

      result = result + word1Char + word2Char;
    }

    return result;
  }
}
