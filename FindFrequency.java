import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequency {
    public static void main(String[] args) {

        String name = "ridhimabanik";
        int[] arr = {1, 5, 5, 7, 5, 6, 3, 6, 2, 5, 4, 8, 2, 1, 5, 8, 2, 3, 5};
        findStringFrequencyWithMap(name);
        findStringFrequencyWithStream(name);
        findStringFrequencyWithStream(arr);
    }

    private static void findStringFrequencyWithStream(int[] arr) {

        Map<Integer, Long> collect = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(collect);
    }

    private static void findStringFrequencyWithStream(String name) {


        Map<Character, Long> collect = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(collect);
    }

    private static void findStringFrequencyWithMap(String name) {

        char[] chars = name.toCharArray();
        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : chars) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        System.out.println(frequency);

        for (char c : frequency.keySet()) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (int i : frequency.values()) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (Map.Entry map : frequency.entrySet()) {
            System.out.print(map + " ");
        }

        System.out.println();

        char c = 0;
        int v = 0;

        for (Map.Entry entry : frequency.entrySet()) {
            int value = (int) entry.getValue();
            if (v < value) {
                v = value;
                c = (char) entry.getKey();
            }
        }
        System.out.println(c + " : " + v);
    }
}
