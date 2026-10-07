package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {

//        Input: nums = [-1,0,1,2,-1,-4]
//        Output: [[-1,-1,2],[-1,0,1]]

        twoPointersTechnique();  // This code is Not working properly
//        bruteForceTechnique();

    }

    private static void twoPointersTechnique() {
        //        This is Two Pointers technique
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        int target = 0;
        int left = 1;
        int right = nums.length-1;
        List<List<Integer>> list = new ArrayList<>();

        while (left != right) {

            int sum = nums[left] + nums[0] + nums[right];

            if (sum == target) {
                list.add(List.of(nums[left], nums[0], nums[right]));
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        for (List a : list) {
            System.out.println(a);
        }

    }

    private static void bruteForceTechnique() {
        // This is Brute Force technique
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == target && list.size() < 2) {
                        list.add(List.of(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        for (List a : list) {
            System.out.println(a);
        }
    }
}
