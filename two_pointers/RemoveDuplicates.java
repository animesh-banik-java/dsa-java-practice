package two_pointers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    static String result = "";

    public static void main(String[] args) {

        String name = "AnimeshBanik";
        int[] shortedArr = {2, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 8, 9, 9};
        int[] unShortedArr = {5, 8, 2, 8, 6, 7, 4, 8, 2, 3, 6};

//        removeDuplicateNumbersShortedArray(shortedArr);
//        removeDuplicateNumbersUnsortedArray(unShortedArr);
//        removeDuplicateString(name);
        removeDuplicateStringWithStream(name);
    }

    private static void removeDuplicateStringWithStream(String name) {

        name.chars().distinct().forEach(x -> System.out.print((char) x));

        System.out.println();

        name.chars().distinct().mapToObj(value -> (char) value).forEach(System.out::print);

        System.out.println();

        String[] split = name.split("");
        String collect = Arrays.stream(split).distinct().collect(Collectors.joining());
        System.out.println(collect);

    }

    private static void removeDuplicateString(String string) {

//        First Way
        char[] chars = string.toLowerCase().toCharArray();

        for (char c : chars) {
            if (!checkDuplicateChar(String.valueOf(c))) {
                result = result + c;
            }
        }

        System.out.println(result);

        result = "";

//        Second Way
        for (int i = 0; i < string.length(); i++) {
            if (!checkDuplicateChar(String.valueOf(string.charAt(i)))) {
                result = result + string.charAt(i);
            }
        }
        System.out.println(result);
    }

    private static boolean checkDuplicateChar(String c) {
        return result.contains(c);
    }

    private static void removeDuplicateNumbersShortedArray(int[] arr) {

        Arrays.stream(arr).distinct().forEach(System.out::print);
    }

    private static void removeDuplicateNumbersUnsortedArray(int[] arr) {


    }

}
