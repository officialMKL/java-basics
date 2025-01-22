package workshop.exercises.control;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to tax: ");
        double amount = input.nextDouble();
        System.out.println("What calculation should be made?");
        System.out.println("Calculate for business (b)");
        System.out.println("Calculate for private persons (p)");


        BigDecimal tax = switch (input.next()) {
            case "b" -> BigDecimal.valueOf(1.3).setScale(2, RoundingMode.HALF_UP);
            case "p" -> BigDecimal.valueOf(1.23).setScale(2, RoundingMode.HALF_UP);
            default -> throw new IllegalStateException("Unexpected value: " + input);
        };
        BigDecimal taxedAmount = BigDecimal.valueOf(amount).setScale(2, RoundingMode.HALF_UP).multiply(tax);
        System.out.println("Taxed amount: " + taxedAmount);
    }
}
