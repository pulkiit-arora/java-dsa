package Arrays;

import java.util.Map;

/**
 * TwoSum class provides a method to find indices of two numbers in an array that add up to a target value.
 * It includes a main method to test the functionality with predefined test cases.
 *
 * Brief Description:
 *      Idea is to use a HashMap to store the numbers and their indices as we iterate through the array.
 *      When we find a number, we check if the complement (target - current number) exists in the map.
 *      If it does, we return the indices of the current number and its complement.
 *      If not, we add the current number and its index to the map.
 *      This approach ensures we find the solution in a single pass with O(n) time complexity.
 *      Space complexity is O(n) due to the HashMap storage.
 *      Example:
 *      Given nums = [2, 7, 11, 15] and target = 9,
 *      the method will return indices [0, 1] because nums[0] + nums[1] = 2 + 7 = 9.
 *
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int toFind = target - nums[i];
            if (numToIndex.containsKey(toFind)) {
                return new int[]{numToIndex.get(toFind), i};
            }else {
                numToIndex.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};  // Return -1, -1 if no solution is found
    }

    public static void main(String[] args) {
        int[][] testArrays = {{2, 7, 11, 15}, {-3, 4, 3, 90}, {3, 3, 4, 5}};
        int[] targets = {9, 0, 6};
        TwoSum solver = new TwoSum();

        for (int i = 0; i < testArrays.length; i++) {
            int[] result = solver.twoSum(testArrays[i], targets[i]);
            boolean passed = result.length == 2
                    && (result[0] != -1 && result[1] != -1)
                    && testArrays[i][result[0]] + testArrays[i][result[1]] == targets[i];
            System.out.print("Test " + (i + 1) + ": ");
            if (passed) {
                System.out.println("Passed (Indices: " + result[0] + ", " + result[1] + ")");
            } else {
                System.out.println("Failed");
            }
        }
    }
}