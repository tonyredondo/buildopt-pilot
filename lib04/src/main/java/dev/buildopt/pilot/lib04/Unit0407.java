package dev.buildopt.pilot.lib04;

public final class Unit0407 {
    private Unit0407() {
    }

    public static long value(long input) {
        long value = input + 407L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 407L);
        }
        return value;
    }
}
