class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length== 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int result = 0;

        for (int num : numSet) {
            if (!numSet.contains(num-1)) {
                int current = num;
                int sequence = 0;
                while (numSet.contains(current)) {
                    sequence++;
                    current++;
                }

                if (result < sequence) {
                    result = sequence;
                }
            }
        }

        return result;
    }
}
