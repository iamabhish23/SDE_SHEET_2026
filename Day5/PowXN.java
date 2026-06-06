/*
Question: Pow(x, n)

Implement pow(x, n), which calculates x raised to the power n.

Approach:
Use Binary Exponentiation to reduce the power by half at each step.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public double myPow(double x, int n) {

        long power = n;
        double ans = 1.0;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        while (power > 0) {

            if ((power & 1) == 1) {
                ans *= x;
            }

            x *= x;
            power /= 2;
        }

        return ans;
    }
}
