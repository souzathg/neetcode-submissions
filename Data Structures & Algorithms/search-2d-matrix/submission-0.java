class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length - 1;

        while (l <= r) {
            int mid = l + ((r - l) / 2);

            int innerLength = matrix[mid].length;

            if (target < matrix[mid][0]) {
                r = --mid;
            } else if (target > matrix[mid][innerLength - 1]) {
                l = ++mid;
            } else {
                return binarySearchInner(matrix[mid], target);
            }
        }

        return false;
    }

    private boolean binarySearchInner(int[] array, int target) {
        int l = 0;
        int r = array.length - 1;

        while (l <= r) {
            int mid = l + ((r - l) / 2);

            if (target < array[mid]) {
                r = --mid;
            } else if (target > array[mid]) {
                l = ++mid;
            } else {
                return true;
            }
        }

        return false;
    }
}
