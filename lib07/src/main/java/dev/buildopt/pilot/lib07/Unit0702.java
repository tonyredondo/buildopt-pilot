package dev.buildopt.pilot.lib07;

public final class Unit0702 {
    private Unit0702() {
    }

    public static long value(long input) {
        long value = input + 702L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 702L);
        }
        return value;
    }
}
