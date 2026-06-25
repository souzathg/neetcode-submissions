class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const complementIndexMap = new Map();

        for (let i = 0; i < nums.length; i++) {
            const complement = target - nums[i];

            if (complementIndexMap.has(complement)) {
                return [complementIndexMap.get(complement), i];
            } else {
                complementIndexMap.set(nums[i], i);
            }
        }

        return [];
    }
}
