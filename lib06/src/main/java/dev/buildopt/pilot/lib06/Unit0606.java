package dev.buildopt.pilot.lib06;

public final class Unit0606 {
    private Unit0606() {
    }

    public static long value(long input) {
        long value = input + 606L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 606L);
        }
        return value;
    }
}
