package by.devpav.valid_parentheses;

public class Solution {

    public boolean isValid(final String content) {
        final int[] brackets = new int[content.length()];

        for (int i = 0; i < content.length(); i++) {
            final char symbol = content.charAt(i);

            final int bracket = this.getSpecSymbol(symbol);

            brackets[i] = bracket;
        }

        boolean valid = false;
        int prev = 0;
        for (int i = 0; i < brackets.length; i++) {
            final int bracket = brackets[i];

            if (bracket > 0) {
                prev = bracket;
                final int[] group = getGroup(brackets, new int[]{i, brackets.length});

                valid = group != null;

                if (!valid) {
                    return false;
                } else {
                    i = group[1];
                }
            } else {
                valid = false;

                if (prev == 0) {
                    return false;
                }
            }
        }

        return valid;
    }

    private int[] getGroup(final int[] brackets, final int[] indexes) {
        if (indexes.length == 0) {
            return null;
        }

        final int fromIndex = indexes[0];
        final int toIndex = indexes[1];

        final int currentBracket = brackets[fromIndex];

        for (int i = fromIndex + 1; i < toIndex; i++) {
            final int bracket = brackets[i];

            if (currentBracket == (bracket * -1))
                return new int[]{fromIndex, i};

            int[] subGroup = null;

            if (bracket > 0) {
                subGroup = getGroup(brackets, new int[] { i, toIndex });
            }

            if (subGroup == null) {
                return null;
            } else if (subGroup[1] != 0) {
                i = subGroup[1];
            }
        }

        return null;
    }

    private int getSpecSymbol(char element) {
        return switch (element) {
            case '[' -> 1;
            case '(' -> 2;
            case '{' -> 3;
            case ']' -> -1;
            case ')' -> -2;
            case '}' -> -3;
            default -> 0;
        };
    }
}