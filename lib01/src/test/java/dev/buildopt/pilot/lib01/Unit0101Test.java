package dev.buildopt.pilot.lib01;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

final class Unit0101Test {
    @Test
    void producesStableNonZeroWork() {
        assertNotEquals(0L, Unit0101.value(7L));
    }
}
