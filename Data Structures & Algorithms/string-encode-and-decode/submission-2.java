class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        for (String str : strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        char[] strChar = str.toCharArray();

        int i = 0;
        int j = i;

        while (i < strChar.length) {
            if (strChar[j] != '#') {
                j++;
            } else {
                int length = Integer.parseInt(String.valueOf(strChar, i, j-i));
                String subStr = String.valueOf(strChar, j+1, length);
                res.add(subStr);
                i = j + 1 + length;
                j = i;
            }

        }

        return res;

    }
}
