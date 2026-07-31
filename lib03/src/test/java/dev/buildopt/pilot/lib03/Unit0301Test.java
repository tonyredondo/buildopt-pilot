package dev.buildopt.pilot.lib03;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

final class Unit0301Test {
    @Test
    void producesStableNonZeroWork() {
        assertNotEquals(0L, Unit0301.value(7L));
    }
}
