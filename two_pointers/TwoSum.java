package two_pointers;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSumCalculate1(numbers, target);

        for (int a : ints) {
            System.out.println(a + " ");
        }

        int[] ints2 = twoSumCalculate2(numbers, target);

        for (int a : ints2) {
            System.out.print(a + " ");
        }


    }

    public static int[] twoSumCalculate2(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i != j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[2];
    }

    public static int[] twoSumCalculate1(int[] numbers, int target) {

        int[] ret = new int[2];

        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {

                int sum = numbers[i] + numbers[j];

                if (sum == target) {

                    ret[0] = i;
                    ret[1] = j;

                    return ret;
                }
            }
        }

        return ret;
    }
}