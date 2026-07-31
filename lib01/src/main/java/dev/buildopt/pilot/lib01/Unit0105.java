package dev.buildopt.pilot.lib01;

public final class Unit0105 {
    private Unit0105() {
    }

    public static long value(long input) {
        long value = input + 105L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 105L);
        }
        return value;
    }
}
