/*
Question: Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring
without repeating characters.

Approach:
Use Sliding Window with HashSet.
Expand the right pointer and remove characters from the left
until the substring contains no duplicates.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
