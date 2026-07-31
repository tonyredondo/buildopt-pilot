package dev.buildopt.pilot.lib07;

public final class Unit0705 {
    private Unit0705() {
    }

    public static long value(long input) {
        long value = input + 705L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 705L);
        }
        return value;
    }
}
