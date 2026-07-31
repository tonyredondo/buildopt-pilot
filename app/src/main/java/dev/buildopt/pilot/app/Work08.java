package dev.buildopt.pilot.app;

public final class Work08 {
    private Work08() {
    }

    public static long value(long input) {
        long value = input + 808L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 808L);
        }
        return value;
    }
}
