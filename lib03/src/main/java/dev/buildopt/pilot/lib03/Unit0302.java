package dev.buildopt.pilot.lib03;

public final class Unit0302 {
    private Unit0302() {
    }

    public static long value(long input) {
        long value = input + 302L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 302L);
        }
        return value;
    }
}
