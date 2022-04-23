package com.loilei.longestsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    @Test
    void lengthOfLongestSubstring_whenInputIsValid_CorrectOutputIsCalculated1() {
        //GIVEN
        var longestSubstring = new LongestSubstring();
        String input = "abcabcbb";
        //WHEN
        int result = longestSubstring.lengthOfLongestSubstring(input);
        //THEN
        assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring_whenInputIsValid_CorrectOutputIsCalculated2() {
        //GIVEN
        var longestSubstring = new LongestSubstring();
        String input = "bbbbb";
        //WHEN
        int result = longestSubstring.lengthOfLongestSubstring(input);
        //THEN
        assertEquals(1, result);
    }


    @Test
    void lengthOfLongestSubstring_whenInputIsValid_CorrectOutputIsCalculated3() {
        //GIVEN
        var longestSubstring = new LongestSubstring();
        String input = "pwwkew";
        //WHEN
        int result = longestSubstring.lengthOfLongestSubstring(input);
        //THEN
        assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring_whenInputIsValid_CorrectOutputIsCalculated4() {
        //GIVEN
        var longestSubstring = new LongestSubstring();
        String input = "abcadefg";
        //WHEN
        int result = longestSubstring.lengthOfLongestSubstring(input);
        //THEN
        assertEquals(7, result);
    }

}