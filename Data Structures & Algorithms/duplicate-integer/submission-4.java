class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicateCheckSet = new HashSet<>();

        for (int num : nums) {
            if (duplicateCheckSet.contains(num)) {
                return true;
            }
            duplicateCheckSet.add(num);
        }

        return false;
    }
}