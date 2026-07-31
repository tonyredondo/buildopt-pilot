package dev.buildopt.pilot.app;

public final class Work07 {
    private Work07() {
    }

    public static long value(long input) {
        long value = input + 807L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 807L);
        }
        return value;
    }
}
