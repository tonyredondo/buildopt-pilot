package dev.buildopt.pilot.app;

public final class Work02 {
    private Work02() {
    }

    public static long value(long input) {
        long value = input + 802L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 802L);
        }
        return value;
    }
}
