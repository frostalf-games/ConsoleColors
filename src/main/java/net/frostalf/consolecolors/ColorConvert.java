/*
 * The MIT License
 *
 * Copyright 2020 Frostalf.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.frostalf.consolecolors;

import java.util.Collection;

/**
 * @author Frostalf
 */
public class ColorConvert {

    public final static String RESET_SEQUENCE = "\u001b[0m";
    public final static String COLOR_SEQUENCE = "\u001b[38;5;%dm";

    public ColorConvert() {
    }

    /**
     * @param num ANSI color code
     * @return returns hex value
     * @throws IllegalArgumentException If 8 bit number is greater than 256 or less than 0
     */
    public static String getHexValue(int num) throws IllegalArgumentException {
        ColorChecker.checkColorCode(num);
        int red = (num & 0x0ff) << 16;
        int green = (num & 0x0ff) << 8;
        int blue = (num & 0x0ff);
        int red2 = (red / 8) * 256;
        int green2 = (green / 8) * 256;
        int blue2 = (blue / 8) * 256;
        int hexvalue = (red2 >> 5) | (green2 >> 2) | blue2;
        return Integer.toHexString(hexvalue);
    }

    /**
     * @param hex Hex color code
     * @return returns ANSI color code
     * @throws IllegalArgumentException if hex string is greater then 6
     *                                  characters or doesn't contain valid rgb values
     */
    public static int getIntValue(String hex) throws IllegalArgumentException {
        int rgb = 0;
        int r = 0;
        int g = 0;
        int b = 0;
        if (hex.contains(",")) {
            final String[] rgbs = hex.split(",");
            if (rgbs.length == 3) {
                r = Integer.parseInt(rgbs[0]);
                g = Integer.parseInt(rgbs[1]);
                b = Integer.parseInt(rgbs[2]);
                ColorChecker.checkColorCode(r);
                ColorChecker.checkColorCode(g);
                ColorChecker.checkColorCode(b);
                rgb = 65536 * r + 256 * g + b;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            if (hex.length() >= 6) {
                rgb = Integer.parseInt(hex, 16);
            } else {
                throw new IllegalArgumentException();
            }
        }
        int red = (rgb >> 16) & 0x0ff;
        int green = (rgb >> 8) & 0x0ff;
        int blue = (rgb) & 0x0ff;
        int red2 = (red * 8) / 256;
        int green2 = (green * 8) / 256;
        int blue2 = (blue * 8) / 256;
        return (red2 << 5) | (green2 << 2) | blue2;
    }

    public static String translateColorCode(String message, ColorPlaceholder colorPlaceholder) {
        return message.replace(colorPlaceholder.getPlaceholder(), String.format(COLOR_SEQUENCE, colorPlaceholder.getColorReplacement()));
    }

    /**
     * This method uses an array of {@link ColorPlaceholder}
     * to replace all of the defined placeholders in any given string.
     *
     * @param message           The message to parse.
     * @param colorPlaceholders The placeholders to use.
     * @return The new message.
     */
    public static String translateColorCodes(String message, ColorPlaceholder... colorPlaceholders) {
        for (ColorPlaceholder colorPlaceholder : colorPlaceholders) {
            message = translateColorCode(message, colorPlaceholder);
        }
        return message;
    }

    /**
     * This method uses a Collection of {@link ColorPlaceholder}
     * to replace all of the defined placeholders in any given string.
     *
     * @param message           The message to parse.
     * @param colorPlaceholders The placeholders to use.
     * @return The new message.
     */
    public static String translateColorCodes(String message, Collection<ColorPlaceholder> colorPlaceholders) {
        for (ColorPlaceholder colorPlaceholder : colorPlaceholders) {
            message = translateColorCode(message, colorPlaceholder);
        }
        return message;
    }

    /**
     * @param num     ANSI color number
     * @param message message to append color code
     * @return returns message with escape sequence
     * @throws IllegalArgumentException if number provided is greater than 256
     */
    public static String escapeSequence(int num, String message) throws IllegalArgumentException {
        ColorChecker.checkColorCode(num);
        return "\u001b[38;5;" + num + "m" + message + RESET_SEQUENCE;
    }

    /**
     * @param hex     Hex color code(Either 6 character hex, or 3 number values
     *                separated with a ',') to transform to ANSI color code
     * @param message mesage to append color code
     * @return returns message with escape sequence
     */
    public static String escapeSequence(String hex, String message) {
        return "\u001b[38;5;" + getIntValue(hex) + "m" + message + RESET_SEQUENCE;
    }
}
