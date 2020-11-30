/*
 * To change this license header, "choose License Headers in Project Properties.
 * To change this template file, "choose Tools | Templates
 * and open the template in the editor.
 */
package net.frostalf.consolecolors;

import java.util.HashMap;

/**
 *
 * @author Frostalf
 */
public class ColorEnum {

    private final HashMap<Integer, String> colorMapInt = new HashMap<>();
    private final HashMap<String, Integer> colorMapHex = new HashMap<>();
    private static ColorEnum instance;

    private ColorEnum() {
        instance = this;
        colorMapInt.put(0, "000000");
        colorMapInt.put(1, "800000");
        colorMapInt.put(2, "008000");
        colorMapInt.put(3, "808000");
        colorMapInt.put(4, "000080");
        colorMapInt.put(5, "800080");
        colorMapInt.put(6, "008080");
        colorMapInt.put(7, "c0c0c0");
        colorMapInt.put(8, "808080");
        colorMapInt.put(9, "ff0000");
        colorMapInt.put(10, "00ff00");
        colorMapInt.put(11, "ffff00");
        colorMapInt.put(12, "0000ff");
        colorMapInt.put(13, "ff00ff");
        colorMapInt.put(14, "00ffff");
        colorMapInt.put(15, "ffffff");
        colorMapInt.put(16, "000000");
        colorMapInt.put(17, "00005f");
        colorMapInt.put(18, "000087");
        colorMapInt.put(19, "0000af");
        colorMapInt.put(20, "0000d7");
        colorMapInt.put(21, "0000ff");
        colorMapInt.put(22, "005f00");
        colorMapInt.put(23, "005f5f");
        colorMapInt.put(24, "005f87");
        colorMapInt.put(25, "005faf");
        colorMapInt.put(26, "005fd7");
        colorMapInt.put(27, "005fff");
        colorMapInt.put(28, "008700");
        colorMapInt.put(29, "00875f");
        colorMapInt.put(30, "008787");
        colorMapInt.put(31, "0087af");
        colorMapInt.put(32, "0087d7");
        colorMapInt.put(33, "0087ff");
        colorMapInt.put(34, "00af00");
        colorMapInt.put(35, "00af5f");
        colorMapInt.put(36, "00af87");
        colorMapInt.put(37, "00afaf");
        colorMapInt.put(38, "00afd7");
        colorMapInt.put(39, "00afff");
        colorMapInt.put(40, "00d700");
        colorMapInt.put(41, "00d75f");
        colorMapInt.put(42, "00d787");
        colorMapInt.put(43, "00d7af");
        colorMapInt.put(44, "00d7d7");
        colorMapInt.put(45, "00d7ff");
        colorMapInt.put(46, "00ff00");
        colorMapInt.put(47, "00ff5f");
        colorMapInt.put(48, "00ff87");
        colorMapInt.put(49, "00ffaf");
        colorMapInt.put(50, "00ffd7");
        colorMapInt.put(51, "00ffff");
        colorMapInt.put(52, "5f0000");
        colorMapInt.put(53, "5f005f");
        colorMapInt.put(54, "5f0087");
        colorMapInt.put(55, "5f00af");
        colorMapInt.put(56, "5f00d7");
        colorMapInt.put(57, "5f00ff");
        colorMapInt.put(58, "5f5f00");
        colorMapInt.put(59, "5f5f5f");
        colorMapInt.put(60, "5f5f87");
        colorMapInt.put(61, "5f5faf");
        colorMapInt.put(62, "5f5fd7");
        colorMapInt.put(63, "5f5fff");
        colorMapInt.put(64, "5f8700");
        colorMapInt.put(65, "5f875f");
        colorMapInt.put(66, "5f8787");
        colorMapInt.put(67, "5f87af");
        colorMapInt.put(68, "5f87d7");
        colorMapInt.put(69, "5f87ff");
        colorMapInt.put(70, "5faf00");
        colorMapInt.put(71, "5faf5f");
        colorMapInt.put(72, "5faf87");
        colorMapInt.put(73, "5fafaf");
        colorMapInt.put(74, "5fafd7");
        colorMapInt.put(75, "5fafff");
        colorMapInt.put(76, "5fd700");
        colorMapInt.put(77, "5fd75f");
        colorMapInt.put(78, "5fd787");
        colorMapInt.put(79, "5fd7af");
        colorMapInt.put(80, "5fd7d7");
        colorMapInt.put(81, "5fd7ff");
        colorMapInt.put(82, "5fff00");
        colorMapInt.put(83, "5fff5f");
        colorMapInt.put(84, "5fff87");
        colorMapInt.put(85, "5fffaf");
        colorMapInt.put(86, "5fffd7");
        colorMapInt.put(87, "5fffff");
        colorMapInt.put(88, "870000");
        colorMapInt.put(89, "87005f");
        colorMapInt.put(90, "870087");
        colorMapInt.put(91, "8700af");
        colorMapInt.put(92, "8700d7");
        colorMapInt.put(93, "8700ff");
        colorMapInt.put(94, "875f00");
        colorMapInt.put(95, "875f5f");
        colorMapInt.put(96, "875f87");
        colorMapInt.put(97, "875faf");
        colorMapInt.put(98, "875fd7");
        colorMapInt.put(99, "875fff");
        colorMapInt.put(100, "878700");
        colorMapInt.put(101, "87875f");
        colorMapInt.put(102, "878787");
        colorMapInt.put(103, "8787af");
        colorMapInt.put(104, "8787d7");
        colorMapInt.put(105, "8787ff");
        colorMapInt.put(106, "87af00");
        colorMapInt.put(107, "87af5f");
        colorMapInt.put(108, "87af87");
        colorMapInt.put(109, "87afaf");
        colorMapInt.put(110, "87afd7");
        colorMapInt.put(111, "87afff");
        colorMapInt.put(112, "87d700");
        colorMapInt.put(113, "87d75f");
        colorMapInt.put(114, "87d787");
        colorMapInt.put(115, "87d7af");
        colorMapInt.put(116, "87d7d7");
        colorMapInt.put(117, "87d7ff");
        colorMapInt.put(118, "87ff00");
        colorMapInt.put(119, "87ff5f");
        colorMapInt.put(120, "87ff87");
        colorMapInt.put(121, "87ffaf");
        colorMapInt.put(122, "87ffd7");
        colorMapInt.put(123, "87ffff");
        colorMapInt.put(124, "af0000");
        colorMapInt.put(125, "af005f");
        colorMapInt.put(126, "af0087");
        colorMapInt.put(127, "af00af");
        colorMapInt.put(128, "af00d7");
        colorMapInt.put(129, "af00ff");
        colorMapInt.put(130, "af5f00");
        colorMapInt.put(131, "af5f5f");
        colorMapInt.put(132, "af5f87");
        colorMapInt.put(133, "af5faf");
        colorMapInt.put(134, "af5fd7");
        colorMapInt.put(135, "af5fff");
        colorMapInt.put(136, "af8700");
        colorMapInt.put(137, "af875f");
        colorMapInt.put(138, "af8787");
        colorMapInt.put(139, "af87af");
        colorMapInt.put(140, "af87d7");
        colorMapInt.put(141, "af87ff");
        colorMapInt.put(142, "afaf00");
        colorMapInt.put(143, "afaf5f");
        colorMapInt.put(144, "afaf87");
        colorMapInt.put(145, "afafaf");
        colorMapInt.put(146, "afafd7");
        colorMapInt.put(147, "afafff");
        colorMapInt.put(148, "afd700");
        colorMapInt.put(149, "afd75f");
        colorMapInt.put(150, "afd787");
        colorMapInt.put(151, "afd7af");
        colorMapInt.put(152, "afd7d7");
        colorMapInt.put(153, "afd7ff");
        colorMapInt.put(154, "afff00");
        colorMapInt.put(155, "afff5f");
        colorMapInt.put(156, "afff87");
        colorMapInt.put(157, "afffaf");
        colorMapInt.put(158, "afffd7");
        colorMapInt.put(159, "afffff");
        colorMapInt.put(160, "d70000");
        colorMapInt.put(161, "d7005f");
        colorMapInt.put(162, "d70087");
        colorMapInt.put(163, "d700af");
        colorMapInt.put(164, "d700d7");
        colorMapInt.put(165, "d700ff");
        colorMapInt.put(166, "d75f00");
        colorMapInt.put(167, "d75f5f");
        colorMapInt.put(168, "d75f87");
        colorMapInt.put(169, "d75faf");
        colorMapInt.put(170, "d75fd7");
        colorMapInt.put(171, "d75fff");
        colorMapInt.put(172, "d78700");
        colorMapInt.put(173, "d7875f");
        colorMapInt.put(174, "d78787");
        colorMapInt.put(175, "d787af");
        colorMapInt.put(176, "d787d7");
        colorMapInt.put(177, "d787ff");
        colorMapInt.put(178, "d7af00");
        colorMapInt.put(179, "d7af5f");
        colorMapInt.put(180, "d7af87");
        colorMapInt.put(181, "d7afaf");
        colorMapInt.put(182, "d7afd7");
        colorMapInt.put(183, "d7afff");
        colorMapInt.put(184, "d7d700");
        colorMapInt.put(185, "d7d75f");
        colorMapInt.put(186, "d7d787");
        colorMapInt.put(187, "d7d7af");
        colorMapInt.put(188, "d7d7d7");
        colorMapInt.put(189, "d7d7ff");
        colorMapInt.put(190, "d7ff00");
        colorMapInt.put(191, "d7ff5f");
        colorMapInt.put(192, "d7ff87");
        colorMapInt.put(193, "d7ffaf");
        colorMapInt.put(194, "d7ffd7");
        colorMapInt.put(195, "d7ffff");
        colorMapInt.put(196, "ff0000");
        colorMapInt.put(197, "ff005f");
        colorMapInt.put(198, "ff0087");
        colorMapInt.put(199, "ff00af");
        colorMapInt.put(200, "ff00d7");
        colorMapInt.put(201, "ff00ff");
        colorMapInt.put(202, "ff5f00");
        colorMapInt.put(203, "ff5f5f");
        colorMapInt.put(204, "ff5f87");
        colorMapInt.put(205, "ff5faf");
        colorMapInt.put(206, "ff5fd7");
        colorMapInt.put(207, "ff5fff");
        colorMapInt.put(208, "ff8700");
        colorMapInt.put(209, "ff875f");
        colorMapInt.put(210, "ff8787");
        colorMapInt.put(211, "ff87af");
        colorMapInt.put(212, "ff87d7");
        colorMapInt.put(213, "ff87ff");
        colorMapInt.put(214, "ffaf00");
        colorMapInt.put(215, "ffaf5f");
        colorMapInt.put(216, "ffaf87");
        colorMapInt.put(217, "ffafaf");
        colorMapInt.put(218, "ffafd7");
        colorMapInt.put(219, "ffafff");
        colorMapInt.put(220, "ffd700");
        colorMapInt.put(221, "ffd75f");
        colorMapInt.put(222, "ffd787");
        colorMapInt.put(223, "ffd7af");
        colorMapInt.put(224, "ffd7d7");
        colorMapInt.put(225, "ffd7ff");
        colorMapInt.put(226, "ffff00");
        colorMapInt.put(227, "ffff5f");
        colorMapInt.put(228, "ffff87");
        colorMapInt.put(229, "ffffaf");
        colorMapInt.put(230, "ffffd7");
        colorMapInt.put(231, "ffffff");
        colorMapInt.put(232, "080808");
        colorMapInt.put(233, "121212");
        colorMapInt.put(234, "1c1c1c");
        colorMapInt.put(235, "262626");
        colorMapInt.put(236, "303030");
        colorMapInt.put(237, "3a3a3a");
        colorMapInt.put(238, "444444");
        colorMapInt.put(239, "4e4e4e");
        colorMapInt.put(240, "585858");
        colorMapInt.put(241, "626262");
        colorMapInt.put(242, "6c6c6c");
        colorMapInt.put(243, "767676");
        colorMapInt.put(244, "808080");
        colorMapInt.put(245, "8a8a8a");
        colorMapInt.put(246, "949494");
        colorMapInt.put(247, "9e9e9e");
        colorMapInt.put(248, "a8a8a8");
        colorMapInt.put(249, "b2b2b2");
        colorMapInt.put(250, "bcbcbc");
        colorMapInt.put(251, "c6c6c6");
        colorMapInt.put(252, "d0d0d0");
        colorMapInt.put(253, "dadada");
        colorMapInt.put(254, "e4e4e4");
        colorMapInt.put(255, "eeeeee");

        for (int values : colorMapInt.keySet()) {
            colorMapHex.put(colorMapInt.get(values), values);
        }
    }

    /**
     *
     * @param num ANSI color code
     * @return returns hex value
     */
    public String getHexValue(int num) {
        return colorMapInt.get(num);
    }

    /**
     *
     * @param hex Hex color code
     * @return returns ANSI color code
     */
    public int getIntValue(String hex) {
        return colorMapHex.get(hex);
    }

    /**
     *
     * @param num ANSI color number
     * @param message message to append color code
     * @return returns message with escape sequence
     * @throws IllegalArgumentException if number provided is greater than 256
     */
    public String escapeSecquence(int num, String message) throws IllegalArgumentException {
        if(num > 256) {
            throw new IllegalArgumentException();
        }
        return "\u001b[38;5;" + num + "m" + message + "\u001b[0m";
    }

    /**
     *
     * @param hex Hex color code to transform to ANSI color code
     * @param message mesage to append color code
     * @return returns message with escape sequence
     * @throws IllegalArgumentException if hex string is greater then 6 characters
     */
    public String escapeSecquence(String hex, String message) throws IllegalArgumentException {
        if(hex.length() > 6) {
            throw new IllegalArgumentException();
        }
        return "\u001b[38;5;" + getHexMap().get(hex) + "m" + message + "\u001b[0m";
    }

    /**
     *
     * @return returns Integer to Hex map
     */
    public HashMap<Integer, String> getIntMap() {
        return this.colorMapInt;
    }

    /**
     *
     * @return returns Hex to Integer map
     */
    public HashMap<String, Integer> getHexMap() {
        return this.colorMapHex;
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
