package dev.buildopt.pilot.lib04;

public final class Unit0402 {
    private Unit0402() {
    }

    public static long value(long input) {
        long value = input + 402L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 402L);
        }
        return value;
    }
}
