package dev.buildopt.pilot.lib03;

public final class Unit0303 {
    private Unit0303() {
    }

    public static long value(long input) {
        long value = input + 303L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 303L);
        }
        return value;
    }
}
