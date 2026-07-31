package dev.buildopt.pilot.lib05;

public final class Unit0503 {
    private Unit0503() {
    }

    public static long value(long input) {
        long value = input + 503L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 503L);
        }
        return value;
    }
}
