package com.loilei.longestsubstring;

import java.util.HashSet;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int maxSubstringLength = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            HashSet<Character> usedCharacters = new HashSet<>();
            for (int j = i; j < chars.length; j++) {
                if (usedCharacters.contains(chars[j])) {
                    maxSubstringLength = checkMaxSubstringLength(maxSubstringLength, usedCharacters);
                    break;
                } else {
                    usedCharacters.add(chars[j]);
                }
            }
            maxSubstringLength = checkMaxSubstringLength(maxSubstringLength, usedCharacters);
        }
        return maxSubstringLength;
    }

    private int checkMaxSubstringLength(int maxSubstringLength, HashSet<Character> usedCharacters) {
        if (maxSubstringLength < usedCharacters.size()) {
            maxSubstringLength = usedCharacters.size();
        }
        return maxSubstringLength;
    }
}
