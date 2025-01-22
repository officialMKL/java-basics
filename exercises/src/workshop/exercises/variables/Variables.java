package workshop.exercises.variables;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.print("Enter a double: ");
        double secondNumber = input.nextDouble();

        System.out.print("Enter a boolean: ");
        boolean bool = input.nextBoolean();

        System.out.println("Integer was " + number);
        System.out.println("Double was " + secondNumber);
        System.out.println("Boolean was " + bool);
    }
}
