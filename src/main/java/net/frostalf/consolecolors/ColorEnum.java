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

/**
 *
 * @author Frostalf
 */
public class ColorEnum {

    private static ColorEnum instance;

    private ColorEnum() {
    }

    /**
     *
     * @param num ANSI color code
     * @return returns hex value
     * @throws IllegalArgumentException If 8 bit number is greater than 256 or less than 0
     */
    public String getHexValue(int num) throws IllegalArgumentException {
        if (num > 256 || num < 0) {
            throw new IllegalArgumentException();
        }
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
     *
     * @param hex Hex color code
     * @return returns ANSI color code
     * @throws IllegalArgumentException if hex string is greater then 6
     * characters or doesn't contain valid rgb values
     */
    public int getIntValue(String hex) throws IllegalArgumentException {
        int rgb = 0;
        int r = 0;
        int g = 0;
        int b = 0;
        if (hex.contains(",")) {
            String rgbs[] = hex.split(",");
            if (rgbs.length == 3) {
                r = Integer.valueOf(rgbs[0]);
                g = Integer.valueOf(rgbs[1]);
                b = Integer.valueOf(rgbs[2]);
                if(r > 256 || g > 256 || b > 256 || r < 0 || g < 0 || b < 0) {
                    throw new IllegalArgumentException();
                }
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
        int eightbitvalue = (red2 << 5) | (green2 << 2) | blue2;
        return eightbitvalue;
    }

    /**
     *
     * @param num ANSI color number
     * @param message message to append color code
     * @return returns message with escape sequence
     * @throws IllegalArgumentException if number provided is greater than 256
     */
    public String escapeSecquence(int num, String message) throws IllegalArgumentException {
        if (num > 256) {
            throw new IllegalArgumentException();
        }
        return "\u001b[38;5;" + num + "m" + message + "\u001b[0m";
    }

    /**
     *
     * @param hex Hex color code(Either 6 character hex, or 3 number values
     * separated with a ',') to transform to ANSI color code
     * @param message mesage to append color code
     * @return returns message with escape sequence
     */
    public String escapeSecquence(String hex, String message) {
        return "\u001b[38;5;" + getIntValue(hex) + "m" + message + "\u001b[0m";
    }

    /**
     *
     * @return Convenience method to return instance of this class
     */
    public static ColorEnum getInstance() {
        if (instance == null) {
            instance = new ColorEnum();
        }
        return instance;
    }
}
