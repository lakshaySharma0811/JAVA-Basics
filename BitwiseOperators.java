public class BitwiseOperators {
  public static void main(String[] args) {
    // Bitwise Operator: These operators are used to change the bits(Bit
    // Manipulation)
    // Bit: Smallest unit of data (0, 1)

    // ===============Works on Two or more Variable================
    // Bitwise OR(|) -> (T T = T), (F F = F), (T F = T), (F T = T)
    // Bitwise AND(&) -> (T T = T), (F F = F), (T F = F), (F T = F)
    // Bitwise XOR(^) -> (T T = F), (F F = F), (T F = T), (F T = T)

    // ===============Works on Single Variable================
    // Bitwise Complement(~)
    // Bitwise Left Shift Operator(<<)
    // Bitwise Right Shift Operator(>>)

    int a = 19; // ->
    int b = 5; // ->

    int leftShiftResult = a << 2;
    // 0 0 0 1 0 0 1 1
    // 0 1 0 0 1 1 0 0
    System.out.println(leftShiftResult); // 76

    int rightShiftResult = a >> 2;
    // 0 0 0 1 0 0 1 1
    // 0 0 0 0 0 1 0 0

    System.out.println(rightShiftResult); // 4
  }

}
