package dev.buildopt.pilot.app;

public final class Work05 {
    private Work05() {
    }

    public static long value(long input) {
        long value = input + 805L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 805L);
        }
        return value;
    }
}
