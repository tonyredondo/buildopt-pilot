package dev.buildopt.pilot.lib05;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

final class Unit0501Test {
    @Test
    void producesStableNonZeroWork() {
        assertNotEquals(0L, Unit0501.value(7L));
    }
}
