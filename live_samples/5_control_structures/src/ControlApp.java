import java.time.Month;
import java.util.Random;

public class ControlApp {
    public static void main(String[] args) {
        // TODO: Code inside
        // if statement
        int a = 6, b = 4, c = 8, d = 6;

        if (a == b) {
            // a equals b
        } else if (a > b && c < d) {
            // a greater b and c lower d
        } else {
            // everything else
        }

        // switch case statement
        Month selectedMonth = Month.DECEMBER;
        int dayCount = 0;

        switch (selectedMonth) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> dayCount = 31;
            case FEBRUARY -> dayCount = 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> dayCount = 30;
            default -> dayCount = 0;
        }

        int alternateDayCount = switch (selectedMonth) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
        };

        // for loop
        int count;
        for (count = 0; count < 10; count++) {
            System.out.println("Count: " + count);
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("Count: " + j);
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.print(i + "x" + j + "=" + result + "\t");
            }
            System.out.println();
        }

        // for-each loop
        int[] numbers = {10, 20, 12, 4, 123};

        for (int number : numbers) {
            System.out.println(number);
        }

        // while / do-while loop
        int sum = 0;
        Random random = new Random();
        while (sum < 100) {
            sum += random.nextInt(50);
        }

        System.out.println("Sum: " + sum);
        do {
            sum += random.nextInt(50);
        } while (sum < 100);

        System.out.println("Next Sum: " + sum);

        // exiting loops
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                continue;
            } else if (i % 35 == 0) {
                break;
            }

            System.out.println("Number: " + i);
        }

        iloop:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == j) {
                    System.out.println();
                    continue iloop;
                }
                int result = i * j;
                System.out.print(i + "x" + j + "=" + result + "\t");
            }
            System.out.println();
        }
    }
}
