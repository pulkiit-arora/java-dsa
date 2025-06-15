package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeNumberSumToTarget {

    /**
     *
     *
     * @param nums   the input array of integers
     * @param target the target sum for the triplets
     * @return an array of unique triplets that sum up to the target
     */
    private static int[] threeSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int noToFind = target - nums[i];
            HashSet<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int complement = noToFind - nums[j];
                if (seen.contains(complement)) {
                    System.out.println("Found triplet: " + nums[i] + ", " + nums[j] + ", " + complement);
                } else {
                    seen.add(nums[j]);
                }
            }
        }
        return new int[]{}; // Placeholder for the actual implementation
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        int[] result = ThreeNumberSumToTarget.threeSum(nums, target);
    }
}
