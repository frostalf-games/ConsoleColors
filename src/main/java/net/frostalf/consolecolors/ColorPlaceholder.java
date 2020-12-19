package net.frostalf.consolecolors;

/**
 * A class that defines a placeholder and its associated replacement.
 */
public class ColorPlaceholder {

    private final String placeholder;
    private final int colorReplacement;

    /**
     * Primary constructor
     *
     * @param placeholder      The placeholder that will be eventually replaced with the color value.
     * @param colorReplacement The integer color value that will be used as replacement for the placeholder.
     */
    public ColorPlaceholder(String placeholder, int colorReplacement) {
        this.placeholder = placeholder;
        this.colorReplacement = colorReplacement;
    }

    /**
     * Secondary Constructor
     *
     * @param placeholder      The placeholder that will be eventually replaced with the color value.
     * @param colorHexadecimal The hexadecimal color value that will be used as replacement for the placeholder.
     * @throws IllegalArgumentException If the hexadecimal code is invalid.
     */
    public ColorPlaceholder(String placeholder, String colorHexadecimal) throws IllegalArgumentException {
        this.placeholder = placeholder;
        this.colorReplacement = ColorConvert.getIntValue(colorHexadecimal);
    }

    /**
     * Get the color replacement.
     *
     * @return The color replacement.
     */
    public int getColorReplacement() {
        return colorReplacement;
    }

    /**
     * Get the placeholder.
     *
     * @return The placeholder.
     */
    public String getPlaceholder() {
        return placeholder;
    }
}
