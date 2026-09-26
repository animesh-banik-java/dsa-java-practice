package two_pointers;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] numbers = {7,11,15,2};
        int target = 9;
        int[] ints = twoSumCalculate(numbers, target);

        for (int a : ints) {
            System.out.println(a+" ");
        }

    }

    public static int[] twoSumCalculate(int[] numbers, int target) {

        int[] ret = new int[2];

        for (int i = 0; i<= numbers.length-1; i++){
            for (int j = i+1; j <= numbers.length-1; j++){

                int sum = numbers[i] + numbers[j];

                if(sum == target){

                    ret[0] = i;
                    ret[1] = j;

                    return ret;
                }
            }
        }

        return ret;
    }
}