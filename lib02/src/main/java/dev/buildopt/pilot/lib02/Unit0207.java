package dev.buildopt.pilot.lib02;

public final class Unit0207 {
    private Unit0207() {
    }

    public static long value(long input) {
        long value = input + 207L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 207L);
        }
        return value;
    }
}
