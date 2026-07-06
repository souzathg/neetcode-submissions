class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const freqMap = new Map();

        for (let str of strs) {
            let count = new Array(26).fill(0);

            for (let char of str) {
                count[char.charCodeAt(0) - 'a'.charCodeAt(0)]++;
            }

            const key = count.join(',');

            if (freqMap.has(key)) {
                let anagramList = freqMap.get(key)
                anagramList.push(str)

                freqMap.set(key, anagramList)
            } else {
                freqMap.set(key, [str])
            }
        }

        const groupedList = [];

        freqMap.forEach((value, key) => groupedList.push(value))

        return groupedList
    }
}
