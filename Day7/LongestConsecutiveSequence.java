/*
Question: Longest Consecutive Sequence

Given an unsorted array of integers,
return the length of the longest consecutive elements sequence.

Approach:
Store all elements in a HashSet.
Start counting only when the current element
is the beginning of a sequence.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
