public class MethodsApp {
    public static void main(String[] args) {
        // TODO: Code inside
        MethodsApp.printSomeString();
        printSomeString();

        System.out.printf("Result of method: %d\n", sumNumbers(12, 36));
        MethodsApp ma = new MethodsApp();
        System.out.printf("Result of method (non-static): %d\n", ma.sumNumbersDiff(12, 36));

        // PassByValue
        int someNumber = 10;
        changeParameter(someNumber);
        System.out.printf("Number: %d\n", someNumber);

        // PassByReference
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World!");
        addString(sb);
        System.out.println(sb);

        // multiple return cases
        int positiveResult = calculatePositiveNumbers(10, 23);
        int zero = calculatePositiveNumbers(-10, 26);

        System.out.printf("First result: %d, Second result: %d\n", positiveResult, zero);

        // overloading
        int sumWithInt = sumNumbers(10, 12);
        int sumWithThree = sumNumbers(10, 12, 14);
        double sumWithDouble = sumNumbers(10.5, 25.64);

        // variable arguments
        int variableSum = sumNumbers(1, 2, 3, 4, 5);

        // recursion
        System.out.printf("Faculty of Five: %.2f\n", faculty(5));
    }

    public static void printSomeString() {
        System.out.println("I am printed via a method!");
    }

    public static int sumNumbers(int first, int second) {
        return first + second;
    }

    public static int sumNumbers(int first, int second, int third) {
        return first + second + third;
    }

    public static int sumNumbers(int ...numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static double sumNumbers(double first, double second) {
        return first + second;
    }

    public int sumNumbersDiff(int first, int second) {
        return first + second;
    }

    public static void changeParameter(int someNumber) {
        someNumber += 12;
    }

    public static void addString(StringBuilder stringBuilder) {
        stringBuilder.append("AppendedString");
    }

    public static int calculatePositiveNumbers(int first, int second) {
        if (first < 0 || second < 0) {
            return 0;
        }

        return first + second;
    }

    public static double faculty(int number) {
        if (number<= 1) {
            return 1.0;
        } else {
            return number * faculty(number - 1);
        }
    }
}
