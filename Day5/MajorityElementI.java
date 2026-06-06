/*
Question: Majority Element-I

Given an array nums, return the element that appears more than n/2 times.
It is guaranteed that the majority element always exists.

Approach:
Use Moore's Voting Algorithm.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
