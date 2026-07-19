class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charFreq = new int[26];

        for (char c : s.toCharArray()) {
            charFreq[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charFreq[c - 'a']--;
        }

        for (int i : charFreq) {
            if (i != 0) {
                return false;
            }
        }

        return true;

    }
}
