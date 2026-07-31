package dev.buildopt.pilot.lib07;

public final class Unit0704 {
    private Unit0704() {
    }

    public static long value(long input) {
        long value = input + 704L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 704L);
        }
        return value;
    }
}
