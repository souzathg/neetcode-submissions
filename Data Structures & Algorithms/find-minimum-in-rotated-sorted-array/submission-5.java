class Solution {
    public int findMin(int[] nums) {
        int res = nums[0];

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r-l)/2;
            res = Math.min(res, nums[mid]);

            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            if (nums[l] <= nums[mid]) {
                l = mid + 1;
                System.out.println("Increased 'l'");
            } else {
                r = mid;
                System.out.println("Reduced 'r'");
            }
        }
        
        return res;
    }
}
