class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int front = 0;
        int back = numbers.length - 1;

        int sum = numbers[front] + numbers[back];

        while (sum != target) {
            if (sum > target) {
                back--;
            } else {
                front++;
            }

            sum = numbers[front] + numbers[back];
        }

        int[] result = {front + 1, back + 1};

        return result;
        
    }
}
