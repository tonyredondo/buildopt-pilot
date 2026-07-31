package dev.buildopt.pilot.lib03;

public final class Unit0306 {
    private Unit0306() {
    }

    public static long value(long input) {
        long value = input + 306L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 306L);
        }
        return value;
    }
}
