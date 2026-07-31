package dev.buildopt.pilot.lib06;

public final class Unit0602 {
    private Unit0602() {
    }

    public static long value(long input) {
        long value = input + 602L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 602L);
        }
        return value;
    }
}
