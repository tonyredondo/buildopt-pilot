package dev.buildopt.pilot.app;

public final class Work06 {
    private Work06() {
    }

    public static long value(long input) {
        long value = input + 806L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 806L);
        }
        return value;
    }
}
