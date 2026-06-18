class Solution {
    public int maxArea(int[] height) {
        int ht, wd, ans = 0, area;
        int size = height.length;
        int left =0, right = size -1;
        while (left < right){
            wd = right - left;
            ht = Math.min(height[left], height[right]);
            area = ht * wd;
            ans = Math.max(ans, area);

            if(height[left] < height[right] )
            left++;
            else
             right--;
        }
        return ans;
    }
}
