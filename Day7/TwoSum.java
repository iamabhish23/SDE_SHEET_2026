/*
Question: Two Sum

Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

Approach:
Use HashMap to store previously seen numbers and their indices.
For each number, check if its complement exists.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
