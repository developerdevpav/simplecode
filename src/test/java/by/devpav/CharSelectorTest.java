package by.devpav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CharSelectorTest {

    private static final CharSelector CHAR_SELECTOR = new CharSelector();

    @Test
    void select() {
        final var map = CHAR_SELECTOR.select(new char[]{'a', 'b', 'c', 'a', 'b'});

        Assertions.assertEquals(3, map.size());

        Assertions.assertEquals(map.get('a'), "bcabb");
        Assertions.assertEquals(map.get('b'), "cab");
        Assertions.assertEquals(map.get('c'), "ab");
    }
}