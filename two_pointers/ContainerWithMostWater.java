package two_pointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int h1 = height[left];
            int h2 = height[right];
            int min = Math.min(h2, h1);
            max = Math.max(max, min * (right - 1));

            if (h1 < h2) left++;
            else right--;
        }

        System.out.println(max);

    }
}
