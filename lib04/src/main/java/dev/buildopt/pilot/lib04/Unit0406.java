package dev.buildopt.pilot.lib04;

public final class Unit0406 {
    private Unit0406() {
    }

    public static long value(long input) {
        long value = input + 406L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 406L);
        }
        return value;
    }
}
