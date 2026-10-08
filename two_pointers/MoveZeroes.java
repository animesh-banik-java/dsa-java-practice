package two_pointers;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums = {1, 0, 5, 2, 0, 1, 4, 0, 0};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] != 0) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
