package dev.buildopt.pilot.app;

public final class Work04 {
    private Work04() {
    }

    public static long value(long input) {
        long value = input + 804L;
        for (int index = 0; index < 64; index++) {
            value = (value * 31L) ^ (index + 804L);
        }
        return value;
    }
}
