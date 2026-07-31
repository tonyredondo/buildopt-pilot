package dev.buildopt.pilot.lib04;

import dev.buildopt.pilot.lib03.Unit0308;

public final class Unit0401 {
    private Unit0401() {
    }

    public static long value(long input) {
        long value = Unit0308.value(input) + 401L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 401L);
        }
        return value;
    }
}
