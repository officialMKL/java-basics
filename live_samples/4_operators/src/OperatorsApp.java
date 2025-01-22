public class OperatorsApp {
    public static void main(String[] args) {
        // TODO: Code inside

        // assigning
        int number = 10;
        int a, b, c, d;
        a = b = c = d = 34;

        // simple math operations
        int sum = number + a;
        int difference = number - a;
        int product = number * a;
        int division = a / number;
        int modulo = a % number;

        // math with assignment
        int x = 10;
        x += 10;
        x -= 12;
        x *= 3;
        x /= 2;
        x %= 10;

        // increment / decrement
        int y = 5;
        y++;
        y--;

        int postfix = y++; // postfix = 5
        int prefix = ++y; // prefix = 7;

        // comparisons
        int numberOne = 10, numberTwo = 12;
        boolean equal = numberOne == numberTwo;
        boolean greater = numberOne > numberTwo;
        boolean lower = numberOne < numberTwo;
        boolean lowerEqual = numberOne <= numberTwo;
        boolean greaterEqual = numberOne >= numberTwo;

        // connecting comparisons
        int e = 5, f = 6, g = 7, h = 8;

        boolean and = e == f & g == h;
        boolean or = e > f | g < h;
        boolean not = !(e == f);
        boolean exclusiveOr = e < f ^ g == h;

        // short circuit
        boolean shortAnd = e == f && g == h;
        boolean shortOr = e < f || g < h;

        // bit operations
        int binaryNumber = 0b100;
        int binarySecond = 0b101;

        int bitAnd = binaryNumber & binarySecond;
        int bitOr = binaryNumber | binarySecond;
        int bitExlusiv = binaryNumber ^ binarySecond;

        // moving bits
        int leftMove = binaryNumber << 2;
        int rightMove = binaryNumber >> 2;

        System.out.println("End");
    }
}
