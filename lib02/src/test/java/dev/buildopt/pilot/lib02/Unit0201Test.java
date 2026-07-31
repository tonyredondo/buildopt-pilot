package dev.buildopt.pilot.lib02;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

final class Unit0201Test {
    @Test
    void producesStableNonZeroWork() {
        assertNotEquals(0L, Unit0201.value(7L));
    }
}
