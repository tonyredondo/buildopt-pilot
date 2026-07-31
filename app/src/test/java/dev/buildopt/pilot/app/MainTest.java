package dev.buildopt.pilot.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

final class MainTest {
    @Test
    void producesStableApplicationOutput() {
        assertTrue(Main.summary(7L).startsWith("buildopt-pilot:"));
    }
}
