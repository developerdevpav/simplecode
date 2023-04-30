package by.devpav.longest_common_prefix;

import java.util.Arrays;

public class LongestCommonPrefix {

    private static final String EMPTY_STRING = "";

    public String longestCommonPrefix(String[] strs) {
        String str = null;

        int minString = Integer.MAX_VALUE;
        for (String item: strs) {
            if (minString > item.length()) {
                str = item;
            }
        }

        if (str == null) {
            return EMPTY_STRING;
        }

        int lastIndex = -1;
        for (int i = 0; i < str.length(); i++) {
            boolean contains = contains(strs, str.charAt(i), i);

            if (contains) {
                lastIndex = i;
            } else {
                break;
            }
        }

        if (lastIndex < 0) {
            return EMPTY_STRING;
        }

        return strs[0].substring(0, lastIndex + 1);
    }

    private boolean contains(String[] strings, char symbol, int index) {
        return Arrays.stream(strings)
                .allMatch(string -> string.length() > index && string.charAt(index) == symbol);
    }
}
