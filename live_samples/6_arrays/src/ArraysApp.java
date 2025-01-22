import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        // TODO: Code inside
        // init array
        int[] numberArray;
        numberArray = new int[10];
        int[] otherArray = new int[10];
        int[] fixedArray = {10, 12, 18, 25};

        // array with var
//        var wrongArray = {10, 12};
        var correctArray = new int[]{10, 12, 13};
        var newArray = new int[10];

        // accessing arrays
        int[] intArray = {10, 7, 12, 18, 4};
        int specificNumber = intArray[2];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] *= 2;
        }

        for (int number : intArray) {
            System.out.println(number);
        }

        // using different methods
        System.out.println(intArray);
        System.out.println(Arrays.toString(intArray));

        Arrays.sort(intArray);
        int index = Arrays.binarySearch(intArray, 8);
        int insertIndex = -Arrays.binarySearch(intArray, 16) - 1;

        int[] copy = intArray.clone();

        System.out.println("END");
    }
}
