class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> duplicateCheckSet = new HashSet<>();

        for (int num : nums) {
            duplicateCheckSet.add(num);
        }

        return nums.length != duplicateCheckSet.size();
        
    }
}