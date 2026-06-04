class Solution {
    int[] findTwoElement(int arr[]) {
        int n = arr.length;

        long sumN = (long) n * (n + 1) / 2;
        long sumSqN = (long) n * (n + 1) * (2 * n + 1) / 6;

        long actualSum = 0;
        long actualSqSum = 0;

        for (int num : arr) {
            actualSum += num;
            actualSqSum += (long) num * num;
        }

        long diff = actualSum - sumN;
        long sqDiff = actualSqSum - sumSqN;

        long sum = sqDiff / diff;

        int repeating = (int) ((diff + sum) / 2);
        int missing = (int) (sum - repeating);

        return new int[]{repeating, missing};
    }
}
