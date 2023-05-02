package by.devpav;

import java.util.HashMap;
import java.util.Map;

public class CharSelector {

    public Map<Character, String> select(char[] characters) {
        final var map = new HashMap<Character, String>();

        for (int i = 0; i < characters.length - 1; i++) {
            final var character = characters[i];

            final var stringBuilder = new StringBuilder();

            for (int j = i + 1; j < characters.length; j++) {
                stringBuilder.append(characters[j]);
            }

            if (map.containsKey(character)) {
                final var value = map.getOrDefault(character, "");

                map.put(character, value + stringBuilder);
            } else {
                map.put(character, stringBuilder.toString());
            }
        }

        return map;
    }

}
