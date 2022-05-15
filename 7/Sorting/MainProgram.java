
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
//        int[] numbers = {3, 1, 5, 99, 3, 12};

//        int[] numbers = {-1, 6, 9, 8, 12};
//        int[] numbers = {3, 2, 5, 4, 8};
//        System.out.println("Smallest: " + MainProgram.smallest(numbers));
//
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
//
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public MainProgram() {
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfsmallestNumber = 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfsmallestNumber = i;
            }
        }
        return indexOfsmallestNumber;
    }

    public static int smallest(int[] array) {

        int smallestNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (smallestNumber > array[i]) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int min = table[startIndex];
        int indexOfsmallestFrom = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < min) {
                min = table[i];
                indexOfsmallestFrom = i;
            }
        }
        return indexOfsmallestFrom;

    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
//        System.out.println(Arrays.toString(array));

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;//searching for lowest index  
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }

}
