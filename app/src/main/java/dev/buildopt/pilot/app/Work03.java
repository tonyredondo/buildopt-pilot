package dev.buildopt.pilot.app;

public final class Work03 {
    private Work03() {
    }

    public static long value(long input) {
        long value = input + 803L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 803L);
        }
        return value;
    }
}
