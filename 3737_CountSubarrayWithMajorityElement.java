class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {

        int subarraycount = 0, add;

        int[] prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                add = 1;
            else
                add = 0;
            prefix[i + 1] = prefix[i] + add;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j< nums.length ; j++) {
                int count = prefix[j + 1] - prefix[i];
                int length = (j - i + 1) / 2;
                if (count > length)
                    subarraycount++;
            }
        }
        return subarraycount;
    }
}