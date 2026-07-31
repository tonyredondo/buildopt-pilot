package dev.buildopt.pilot.lib07;

public final class Unit0708 {
    private Unit0708() {
    }

    public static long value(long input) {
        long value = input + 708L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 708L);
        }
        return value;
    }
}
