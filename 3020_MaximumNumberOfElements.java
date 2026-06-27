class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put((long) num, map.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;

        // Special case for 1
        if (map.containsKey(1L)) {
            int ones = map.get(1L);
            ans = Math.max(ans, (ones % 2 == 0) ? ones - 1 : ones);
        }

        // Try each starting number
        for (long x : map.keySet()) {
            if (x == 1) continue;

            int len = 0;
            long curr = x;

            while (map.getOrDefault(curr, 0) >= 2) {
                len += 2;
                curr = curr * curr;
            }

            // middle element
            if (map.containsKey(curr)) {
                len += 1;
            } else {
                len -= 1;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}