/*
Question: Largest Subarray with K Sum

Given an array and an integer K, find the length of the longest
subarray whose sum is equal to K.

Approach:
Use Prefix Sum with HashMap.
Store the first index where each prefix sum appears.
If prefixSum - K already exists, it means the subarray between
that index and current index has sum K.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int longestSubarray(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
