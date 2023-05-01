package by.devpav.find_the_index_of_the_first_occurrence_in_a_string;

public class Solution {

    public int strStr(String haystack, String needle) {
        char firstSymbol = needle.charAt(0);

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == firstSymbol) {
                int endIndex = i + needle.length();

                if (endIndex > haystack.length()) {
                    break;
                }

                if (substring(haystack, needle, i, endIndex)) {
                    return i;
                }
            }
        }

        return -1;
    }

    private boolean substring(final String haystack, String needle, final int startIndex, final int endIndex) {
        int value = 0;
        for (int i = startIndex; i < endIndex; i++) {
            if (haystack.charAt(i) != needle.charAt(value++))
                return false;

            final int lenNeedle = needle.length();
            if (value == lenNeedle)
                return true;
        }
        return false;
    }

}
