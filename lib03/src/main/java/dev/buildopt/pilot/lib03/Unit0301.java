package dev.buildopt.pilot.lib03;

import dev.buildopt.pilot.lib02.Unit0208;

public final class Unit0301 {
    private Unit0301() {
    }

    public static long value(long input) {
        long value = Unit0208.value(input) + 301L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 301L);
        }
        return value;
    }
}
