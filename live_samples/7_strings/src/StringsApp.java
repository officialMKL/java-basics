import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class StringsApp {
    public static void main(String[] args) throws ParseException {
        // TODO: Code inside
        // char type
        char a = 'a';
        char one = '1';
        char tab = '\t';
        char euro = '\u20ac';
        char altEuro = '€';

        // checking chars
        char upperA = Character.toUpperCase(a);
        boolean isDigit = Character.isDigit(one);

        // casting from and to char
        int number = upperA;
        char upperB = (char)(number+1);

        // string class
        String s = "Test";

        // autoconvertion of types
        String converted = s + 1 + upperB;

        // multiline string
        String multiline = """
                I am a multiline string
                As you can see I have a second Line""";
        System.out.println(multiline);

        // comparing strings
        String s1 = "abc";
        String s2 = "ABC";

        boolean simpleEquality = s1 == s2;
        boolean equals = s1.equals(s2);
        boolean withoutCase = s1.equalsIgnoreCase(s2);

        int compare = s1.compareTo(s2);
        int compareWoCase = s1.compareToIgnoreCase(s2);

        // analyzing a string
        String sentence = "I am Fred, the housekeeper";
        int length = sentence.length();
        boolean contains = sentence.contains("Fred");
        boolean notContains = sentence.contains("Freddy");
        boolean ends = sentence.endsWith("keeper");
        int indexOfAm = sentence.indexOf("am");
        char c = sentence.charAt(12);

        // updating a string
        String upperCase = sentence.toUpperCase();
        String substring = sentence.substring(15);
        String replaced = sentence.replace('e', 'o');

        // joining Strings together
        String joined = String.join(" - ", "Hello", "Gday", "Salut", "Hallo");
        String[] words = {"Test", "ABC", "DEF", "Welcome"};
        String anotherJoin = String.join(":", words);

        // formatting a string
        int someNumber = 12;
        String classicWay = "SomeString" + someNumber;
        String formatted = String.format("SomeString %d", someNumber);
        System.out.printf("Some Console output with a Number %d\n", someNumber);

        double division = 10 / 8.5;
        System.out.printf("%f\n", division);
        System.out.printf("%.2f\n", division);

        System.out.printf("-%4d-\n", someNumber);
        System.out.printf("-%-4d-\n", someNumber);

        // converting strings into numbers
        Long convertion = Long.parseLong("124500");
        Long numberSystem = Long.parseLong("FF", 16);

        Double convertedDouble = Double.parseDouble("12.12");

        // localisation
        Locale deLocale = new Locale("de", "DE");
        System.out.printf(deLocale, "%.2f\n", 10.34);

        Locale usLocale = new Locale("en", "US");
        System.out.printf(usLocale, "%.2f\n", 10.34);

        // cast in german language
        NumberFormat numberFormat = NumberFormat.getInstance();
        Number readNumber = numberFormat.parse("10,45");
        double parsedNumber = readNumber.doubleValue();

        // building strings
        String someString = "";

        do {
            someString += "a";
        } while (someString.length() < 100);

        StringBuilder sb = new StringBuilder();

        do {
            sb.append("a");
        } while (sb.length() < 100);

        String builtString = sb.toString();

        System.out.println("END");
    }
}
