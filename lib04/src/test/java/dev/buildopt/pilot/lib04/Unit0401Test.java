package dev.buildopt.pilot.lib04;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

final class Unit0401Test {
    @Test
    void producesStableNonZeroWork() {
        assertNotEquals(0L, Unit0401.value(7L));
    }
}
