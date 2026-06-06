/*
Question: Majority Element-II

Given an integer array of size n, return all elements
that appear more than floor(n/3) times.

Approach:
Use Extended Moore's Voting Algorithm to find
at most two possible candidates and then verify
their frequencies.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 0;

        for (int num : nums) {

            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> ans = new ArrayList<>();

        if (count1 > nums.length / 3) ans.add(candidate1);
        if (count2 > nums.length / 3) ans.add(candidate2);

        return ans;
    }
}
