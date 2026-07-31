package dev.buildopt.pilot.lib02;

public final class Unit0202 {
    private Unit0202() {
    }

    public static long value(long input) {
        long value = input + 202L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 202L);
        }
        return value;
    }
}
