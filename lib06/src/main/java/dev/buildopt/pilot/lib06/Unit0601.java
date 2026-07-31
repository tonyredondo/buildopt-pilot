package dev.buildopt.pilot.lib06;

import dev.buildopt.pilot.lib05.Unit0508;

public final class Unit0601 {
    private Unit0601() {
    }

    public static long value(long input) {
        long value = Unit0508.value(input) + 601L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 601L);
        }
        return value;
    }
}
