/*
Question: Count Subarrays with Given XOR K

Given an array and an integer K, count the number of subarrays
whose XOR is equal to K.

Approach:
Use Prefix XOR with HashMap.
If currentXor ^ K exists in the map, then subarrays ending at
current index with XOR K can be counted.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int subarraysWithXorK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int xor = 0;
        int count = 0;

        map.put(0, 1);

        for (int num : nums) {

            xor = xor ^ num;

            int required = xor ^ k;

            if (map.containsKey(required)) {
                count += map.get(required);
            }

            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}
