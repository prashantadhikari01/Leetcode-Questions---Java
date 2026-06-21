class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;

        for (int i = 1; i <= gain.length; i++) {
            arr[i] = arr[i - 1] + gain[i - 1];
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}

class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int max = 0;

        for (int g : gain) {
            current += g;
            max = Math.max(max, current);
        }

        return max;
    }
}
