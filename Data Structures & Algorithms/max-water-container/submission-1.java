class Solution {
    public int maxArea(int[] heights) {

        int result = 0;

        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            int minHeight = Math.min(heights[l], heights[r]);

            int currentResult = minHeight * (r - l);

            if (currentResult > result) {
                result = currentResult;
            }

            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        
        return result;
    }
}
