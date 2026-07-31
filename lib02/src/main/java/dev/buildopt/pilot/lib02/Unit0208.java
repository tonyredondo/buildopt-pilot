package dev.buildopt.pilot.lib02;

public final class Unit0208 {
    private Unit0208() {
    }

    public static long value(long input) {
        long value = input + 208L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 208L);
        }
        return value;
    }
}
