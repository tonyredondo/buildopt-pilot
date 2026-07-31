package dev.buildopt.pilot.lib02;

public final class Unit0203 {
    private Unit0203() {
    }

    public static long value(long input) {
        long value = input + 203L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 203L);
        }
        return value;
    }
}
