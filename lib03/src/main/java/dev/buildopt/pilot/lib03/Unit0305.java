package dev.buildopt.pilot.lib03;

public final class Unit0305 {
    private Unit0305() {
    }

    public static long value(long input) {
        long value = input + 305L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 305L);
        }
        return value;
    }
}
