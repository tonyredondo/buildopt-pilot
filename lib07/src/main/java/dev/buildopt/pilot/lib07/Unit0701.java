package dev.buildopt.pilot.lib07;

import dev.buildopt.pilot.lib06.Unit0608;

public final class Unit0701 {
    private Unit0701() {
    }

    public static long value(long input) {
        long value = Unit0608.value(input) + 701L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 701L);
        }
        return value;
    }
}
