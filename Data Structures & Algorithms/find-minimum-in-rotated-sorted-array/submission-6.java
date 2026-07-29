class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] < nums[right]) {
                return Math.min(min, nums[left]);
            }

            int mid = left + (right-left)/2;

            if (nums[left] <= nums[mid]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                return Math.min(min, nums[mid]);
            }

            min = Math.min(min, nums[mid]);
        }

        return min;
        
    }
}
