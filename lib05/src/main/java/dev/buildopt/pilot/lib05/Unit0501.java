package dev.buildopt.pilot.lib05;

import dev.buildopt.pilot.lib04.Unit0408;

public final class Unit0501 {
    private Unit0501() {
    }

    public static long value(long input) {
        long value = Unit0408.value(input) + 501L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 501L);
        }
        return value;
    }
}
