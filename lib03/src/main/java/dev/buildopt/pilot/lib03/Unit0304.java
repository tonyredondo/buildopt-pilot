package dev.buildopt.pilot.lib03;

public final class Unit0304 {
    private Unit0304() {
    }

    public static long value(long input) {
        long value = input + 304L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 304L);
        }
        return value;
    }
}
