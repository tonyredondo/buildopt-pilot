package dev.buildopt.pilot.lib05;

public final class Unit0502 {
    private Unit0502() {
    }

    public static long value(long input) {
        long value = input + 502L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 502L);
        }
        return value;
    }
}
