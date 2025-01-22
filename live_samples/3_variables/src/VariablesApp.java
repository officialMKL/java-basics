import java.util.Random;
import java.util.Scanner;

public class VariablesApp {
    public static void main(String[] args) {
        // TODO: Code inside
        // Numbers
        byte number = 127;
        short numberTwo = 32767;
        int numberThree = 1234567;
        long numberFour = 123456789L;

        // Floating Numbers
        float floating = 13.232F;
        double floatingTwo = 45002.49;

        // Math
        int x = 10;
        int y = 20;

        double pow = Math.pow(x, 2);
        double min = Math.min(x, y);
        double max = Math.max(x, y);
        double sqr = Math.sqrt(y);
        long rounded = Math.round(sqr);

        // boolean
        boolean comparison = x == y;
        boolean button = true;

        // Random
        Random random = new Random();
        int randomInt = random.nextInt();
        int randomInt100 = random.nextInt(100);
        double randomDouble = random.nextDouble();
        boolean randomBool = random.nextBoolean();

        // Casting
        // automatic upcast
        int multiplier = 35;
        double amount = 145.45;

        double result = amount * multiplier;

        // specific downcast
        int imprecise = (int) amount * multiplier;

        // type literals
        // standard type literals
        var a = 10; // int
        var b = 10.3; // double

        // explicit type literals
        var c = (byte) 10;
        var d = 10L;
        var e = 10.3f;

        // different number systems
        var hex = 0xfff;
        var oktal = 026;
        var binary = 0b1001;

        // In- / Output
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.nextInt();
        scanner.nextDouble();

        System.out.println("Sample Text");

        System.out.print("Sample");
        System.out.print("Text");
        System.out.println();

        // constants
        final int constant = 10;

//        constant = 20;

        // enums
        Gender gender = Gender.Male;

//        boolean notpossible = gender == 0;
        boolean equal = gender == Gender.Male;


        System.out.println("End");
    }
}
