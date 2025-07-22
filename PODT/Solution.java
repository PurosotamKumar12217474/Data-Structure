package PODT;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int left = 0, currentSum = 0, maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            while (st.contains(nums[i])) {
                st.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            st.add(nums[i]);
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example input
        int[] nums = {4, 2, 4, 5, 6};

        // Call the function and print the result
        int result = sol.maximumUniqueSubarray(nums);
        System.out.println("Maximum Unique Subarray Sum: " + result);
    }
}

