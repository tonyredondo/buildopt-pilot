package dev.buildopt.pilot.lib06;

public final class Unit0603 {
    private Unit0603() {
    }

    public static long value(long input) {
        long value = input + 603L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 603L);
        }
        return value;
    }
}
