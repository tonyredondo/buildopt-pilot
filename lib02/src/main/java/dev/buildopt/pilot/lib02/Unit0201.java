package dev.buildopt.pilot.lib02;

import dev.buildopt.pilot.lib01.Unit0108;

public final class Unit0201 {
    private Unit0201() {
    }

    public static long value(long input) {
        long value = Unit0108.value(input) + 201L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 201L);
        }
        return value;
    }
}
