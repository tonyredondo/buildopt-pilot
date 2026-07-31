package dev.buildopt.pilot.app;

import dev.buildopt.pilot.lib07.Unit0701;

public final class Main {
    private Main() {
    }

    public static String summary(long input) {
        return "buildopt-pilot:" + Work08.value(Unit0701.value(input));
    }

    public static void main(String[] arguments) {
        System.out.println(summary(arguments.length));
    }
}
