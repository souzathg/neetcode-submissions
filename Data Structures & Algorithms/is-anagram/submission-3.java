class Solution {
    public boolean isAnagram(String s, String t) {
        if (!areSameLength(s, t)) {
            return false;
        }

        Map<Character, Integer> sFrequencies = new HashMap<>();
        Map<Character, Integer> tFrequencies = new HashMap<>();

        computeFrequencies(s, sFrequencies);
        computeFrequencies(t, tFrequencies);

        return isRealAnagram(sFrequencies, tFrequencies);
    }

    private boolean areSameLength(String one, String two) {
        return one.length() == two.length();
    }

    private void computeFrequencies(String word, Map<Character, Integer> frequencyMap) {
        for (char c : word.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                var freq = frequencyMap.get(c);
                frequencyMap.put(c, ++freq);
            } else {
                frequencyMap.put(c, 1);
            }
        }
    }

    private boolean isRealAnagram(
        Map<Character, Integer> freqMapOne, 
        Map<Character, Integer> freqMapTwo
    ) {
        for (char key : freqMapOne.keySet()) {
            if (!freqMapOne.get(key).equals(freqMapTwo.get(key))) {
                return false;
            }
        }

        return true;
    }
}
