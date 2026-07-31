package dev.buildopt.pilot.lib07;

public final class Unit0707 {
    private Unit0707() {
    }

    public static long value(long input) {
        long value = input + 707L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 707L);
        }
        return value;
    }
}
