class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let finalStr = "";
        for (let i = 0; i < strs.length; i++) {
            const tempStr = strs[i];

            finalStr = finalStr + `${tempStr.length}#${tempStr}`
        }

        return finalStr;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        console.log(str)

        const finalList = [];
        let nextStrLen = "";
        let i = 0;
        while(i < str.length) {
            if (str[i] !== "#") {
                nextStrLen = nextStrLen + str[i];
                i++;
            } else {
                const nextStrLenInt = parseInt(nextStrLen);

                const startIdx = i + 1;
                const endIdx = startIdx + nextStrLenInt;

                finalList.push(str.substring(startIdx, endIdx));

                i = endIdx;
                nextStrLen = "";
            }
        }
        return finalList;
    }
}
