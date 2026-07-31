package dev.buildopt.pilot.lib03;

public final class Unit0308 {
    private Unit0308() {
    }

    public static long value(long input) {
        long value = input + 308L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 308L);
        }
        return value;
    }
}
