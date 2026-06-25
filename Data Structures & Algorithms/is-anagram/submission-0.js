class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if (s.length !== t.length) {
            return false
        }

        const sFreq = new Map();
        const tFreq = new Map();

        for (const char of s) {
            if (sFreq.has(char)) {
                sFreq.set(char, sFreq.get(char) + 1);
            } else {
                sFreq.set(char, 1);
            }
        }

        for (const char of t) {
            if (tFreq.has(char)) {
                tFreq.set(char, tFreq.get(char) + 1);
            } else {
                tFreq.set(char, 1);
            }
        }

        for (const char of s) {
            if (sFreq.get(char) !== tFreq.get(char)) {
                return false;
            }
        }

        return true;
    }
}
