package by.devpav.longest_common_prefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String prefix = longestCommonPrefix.longestCommonPrefix(new String[]{"a"});

        Assertions.assertEquals("a", prefix);
    }

    @Test
    void longestCommonPrefixD() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String prefix = longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"});

        Assertions.assertEquals("", prefix);
    }

    @Test
    void longestCommonPrefixFl() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String prefix = longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"});

        Assertions.assertEquals("fl", prefix);
    }
    @Test
    void longestCommonPrefixEmptyString() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String prefix = longestCommonPrefix.longestCommonPrefix(new String[]{"","b"});

        Assertions.assertEquals("", prefix);
    }
}