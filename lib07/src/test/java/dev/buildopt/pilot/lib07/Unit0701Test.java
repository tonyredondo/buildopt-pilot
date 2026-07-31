package dev.buildopt.pilot.lib07;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

final class Unit0701Test {
    @Test
    void producesStableNonZeroWork() {
        assertNotEquals(0L, Unit0701.value(7L));
    }
}
