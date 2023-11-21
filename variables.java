class Variable {
    public static void main(String[] args){
        int speedLimit = 80; // Range from -2^31 to 2^31 - 1
        System.out.println(speedLimit); // Prints 80

        boolean possibility = true;
        System.out.println(possibility); // Prints true

        byte real;  // Range from -128 to 127
        real = 127;
        System.out.println(real); // Prints 127

        short temp;  // Range from -32768 to 32767
        temp = 32767;
        System.out.println(temp); // Prints 32767

        double number1 = 1.52525252525252525252;  // Used for decimal numbers
        System.out.println(number1);   // Print the decimal number upto 16 digits after decimal

        float number2 = 1.2525252525f;   // Used for decimal numbers
        System.out.println(number2);  // Print the decimal numbers upto 7digits after decimal

        char form = 'a';
        System.out.println(form);
    }
}
