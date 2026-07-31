package dev.buildopt.pilot.lib06;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

final class Unit0601Test {
    @Test
    void producesStableNonZeroWork() {
        assertNotEquals(0L, Unit0601.value(7L));
    }
}
