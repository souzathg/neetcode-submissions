class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String str : strs) {
            int[] frequencies = buildFrequenciesArrayFromStr(str);

            groupedAnagrams
                .computeIfAbsent(Arrays.toString(frequencies), k -> new ArrayList<String>())
                .add(str);
        }

        for (String key : groupedAnagrams.keySet()) {
            result.add(groupedAnagrams.get(key));
        }

        return result;
    }

    private int[] buildFrequenciesArrayFromStr(String str) {
        int[] frequencies = new int[26];
        Arrays.fill(frequencies, 0);

        for (char c : str.toCharArray()) {
            int idx = c - 'a';

            frequencies[idx]++;
        }

        return frequencies;
    }
}
