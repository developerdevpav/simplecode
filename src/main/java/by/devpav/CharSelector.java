package by.devpav;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharSelector {

    public static List<Map.Entry<Character, String>> main(String[] args) {

        final var map = new HashMap<Character, String>();

        final var characters = new char[] { 'a', 'b', 'v', 'c', 'd', 'a', 's' };

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

        return map.entrySet().stream()
                .sorted(Comparator.comparing(it -> it.getValue().length()))
                .collect(Collectors.toList());
    }

}
