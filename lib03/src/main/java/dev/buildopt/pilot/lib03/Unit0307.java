package dev.buildopt.pilot.lib03;

public final class Unit0307 {
    private Unit0307() {
    }

    public static long value(long input) {
        long value = input + 307L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 307L);
        }
        return value;
    }
}
