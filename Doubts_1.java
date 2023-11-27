public class Doubts_1 {

  public static void main(String[] args) {

    // ================Integer Literals==========================//

    // Binary (0, 1)
    int binaryNumber = 0b100;
    System.out.println(binaryNumber);
    // (1 * 2^2) + (0 * 2^1) + (0 * 2^0) = 4 + 0 + 0 = 4

    // Decimal (0-9)
    int decimal = 10;
    System.out.println(decimal);
    // (1 * 10^1) + (0 * 10^0) = 10 + 0 = 10

    // Octal (0-7)
    int octalNumber = 027;
    System.out.println(octalNumber);
    // (0 * 8^2) + (2 * 8^1) + (7 * 8^0) = 0 + 16 + 7 = 23

    // Hexa Decimal (A, B, C, D, E, F / 0-9)
    int hexNumber = 0x2ACF;
    System.out.println(hexNumber);
    // (2 * 16^3) + (10 * 16^2) + (12 * 16^1) + (15 * 16^0) = 8192 + 2560 + 192 + 15
    // = 10,959

    // ================Floating Point Literals==========================//
    float myFloat = 3.4F;
    System.out.println(myFloat);

    double myDoubleScientific = 2;
    System.out.println(myDoubleScientific);

    //
    char letter = 'a';
    System.out.println(letter);

  };

}
