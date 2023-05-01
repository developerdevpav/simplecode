package by.devpav.length_of_last_word;

public class Solution {

    private static final char SPACE = ' ';

    public int lengthOfLastWord(String s) {
        int j = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != SPACE) {
                j++;
                continue;
            }

            if (SPACE == s.charAt(i) && j != 0) {
                break;
            }
        }

        return j;
    }

}
