package dev.buildopt.pilot.lib04;

public final class Unit0404 {
    private Unit0404() {
    }

    public static long value(long input) {
        long value = input + 404L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 404L);
        }
        return value;
    }
}
