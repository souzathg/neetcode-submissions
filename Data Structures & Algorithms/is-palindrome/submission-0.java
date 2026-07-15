class Solution {
    public boolean isPalindrome(String s) {
        String sanitized = sanitizeString(s);
        char[] cArray = sanitized.toCharArray();

        int i = 0;
        int j = cArray.length - 1;

        while (i < j) {
            if (cArray[i] != cArray[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private String sanitizeString(String str) {
        String sanitized = str.strip()
            .replaceAll("[^a-zA-Z0-9]", "")
            .toLowerCase();

        return sanitized;
    }
}
