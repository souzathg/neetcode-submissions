class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums: number[]): boolean {
        const mySet: Set<number> = new Set(nums);

        if (mySet.size === nums.length) {
            return false
        }

        return true;
    }
}
