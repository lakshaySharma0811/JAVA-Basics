public class Operators {
  public static void main(String[] args) {

    int a = 10;

    int b = ++a; // fist update(a) then assign(b)

    int c = a++; // fist assign(c) then update(a)

    System.out.println("A: " + a);
    System.out.println("C: " + c);
    System.out.println("B: " + b);

  }
}

// Operators - It is a way to tell compiler to do operation between the
// operands.

// Types of operator:
// 1. Arithmetic Operator
// 2. Assignment Operator
// 3. Relational Operator
// 4. Logical Operator
// 5. Bitwise Operator

// 1. Arithmetic Operators:

// Binary Operation (Two Operands)
// + , - , * , / , %
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0

// Unary Operation (One Operand)
// Pre Increment / Pre Decrement
// ++a, --a

// Post Increment / Post Decrement
// a++, a--

// 2. Assignment Operators:
// = , +=, -=, /=, %=
// a = b (b is going in a)
// a += b -> a = a + b
// a -= b -> a = a - b
// a *= b -> a = a * b
// a /= b -> a = a / b
// a %= b -> a = a % b

// 3. Relational Operators: Always returns boolean value
// ==, !=, >, <, >=, <=
// a = 10, b = 20
// a == b (False)
// a != b (True)
// a > b (False)
// a < b (True)
// a >= b (false)
// a <= b (True)

// 4. Logical Operators: Always returns boolean value
// &&(AND), ||(OR), !(NOT)
// a = 10, b = 20, c = 30
// (a > b && c > b) -> false
// (a > b || c > b) -> true
// (!(a > b)) -> true

// ((a > b || c > b) || (a > b && c > b) && (!(a > b))) => true

// 5. Bitwise Operators:
