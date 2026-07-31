package dev.buildopt.pilot.lib04;

public final class Unit0408 {
    private Unit0408() {
    }

    public static long value(long input) {
        long value = input + 408L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 408L);
        }
        return value;
    }
}
