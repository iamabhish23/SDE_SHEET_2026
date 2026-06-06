/*
Question: Grid Unique Paths

Given m and n, find the number of unique paths
from top-left to bottom-right.

Approach:
Use Combinatorics.

Total moves = (m - 1) + (n - 1)

Choose (m - 1) moves out of total moves.

Time Complexity: O(min(m,n))
Space Complexity: O(1)
*/

class Solution {
    public int uniquePaths(int m, int n) {

        int N = m + n - 2;
        int r = Math.min(m - 1, n - 1);

        double ans = 1;

        for (int i = 1; i <= r; i++) {
            ans = ans * (N - r + i) / i;
        }

        return (int) Math.round(ans);
    }
}
