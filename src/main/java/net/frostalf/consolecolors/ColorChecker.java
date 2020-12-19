package net.frostalf.consolecolors;

public final class ColorChecker {

    public final static int MIN_VALUE = 0;
    public final static int MAX_VALUE = 256;

    /**
     * This is a utility class, it should not be instantiated in any way.
     */
    private ColorChecker() {
        throw new UnsupportedOperationException("This is a utility class, hence it cannot be instantiated.");
    }

    /**
     * Check a color code validity.
     *
     * @param colorCode The color code that will be checked.
     * @throws IllegalArgumentException If the color code is smaller than {@link #MIN_VALUE} or greater than {@link #MAX_VALUE}
     */
    public static void checkColorCode(int colorCode) throws IllegalArgumentException {
        if (colorCode > MAX_VALUE) {
            throw new IllegalArgumentException(String.format("The color code used (%d) is greater than maximum limit of ", colorCode) + MAX_VALUE);
        } else if (colorCode < MIN_VALUE) {
            throw new IllegalArgumentException(String.format("The color code used (%d) is smaller than minimum limit of ", colorCode) + MIN_VALUE);
        }
    }
}
