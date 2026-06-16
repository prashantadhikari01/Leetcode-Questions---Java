class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;

        HashSet<Integer> set = new HashSet<>();
        int repeated = 0;
        int sum = 0;

        for (int[] row : grid) {
            for (int num : row) {
                if (set.contains(num)) {
                    repeated = num;
                }
                set.add(num);
                sum += num;
            }
        }

        int expectedSum = size * (size + 1) / 2;
        int missing = expectedSum - (sum - repeated);

        return new int[] {repeated, missing};
    }
}