package dev.buildopt.pilot.lib05;

public final class Unit0504 {
    private Unit0504() {
    }

    public static long value(long input) {
        long value = input + 504L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 504L);
        }
        return value;
    }
}
