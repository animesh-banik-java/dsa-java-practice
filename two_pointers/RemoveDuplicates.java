package two_pointers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] shortedArr = {2, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 8, 9,9};
        int[] unShortedArr = {5, 8, 2, 8, 6, 7, 4, 8, 2, 3, 6};

        removeDuplicateNumbersShortedArray(shortedArr);
        removeDuplicateNumbersUnsortedArray(unShortedArr);
    }

    private static void removeDuplicateNumbersShortedArray(int[] arr) {

        Arrays.stream(arr).distinct().forEach(System.out::print);
    }

    private static void removeDuplicateNumbersUnsortedArray(int[] arr) {


    }

}
