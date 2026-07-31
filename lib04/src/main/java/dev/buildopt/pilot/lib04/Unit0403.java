package dev.buildopt.pilot.lib04;

public final class Unit0403 {
    private Unit0403() {
    }

    public static long value(long input) {
        long value = input + 403L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 403L);
        }
        return value;
    }
}
