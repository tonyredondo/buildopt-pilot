package dev.buildopt.pilot.lib07;

public final class Unit0703 {
    private Unit0703() {
    }

    public static long value(long input) {
        long value = input + 703L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 703L);
        }
        return value;
    }
}
