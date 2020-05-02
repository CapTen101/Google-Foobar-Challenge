public class Solution {
    public static String solution(String si) {
        final String space = "000000", capital = "000001";
        final String a = "100000";
        final String b = "110000";
        final String c = "100100";
        final String d = "100110";
        final String e = "100010";
        final String f = "110100";
        final String g = "110110";
        final String h = "110010";
        final String i = "010100";
        final String j = "010110";
        final String k = "101000";
        final String l = "111000";
        final String m = "101100";
        final String n = "101110";
        final String o = "101010";
        final String p = "111100";
        final String q = "111110";
        final String r = "111010";
        final String s = "011100";
        final String t = "011110";
        final String u = "101001";
        final String v = "111001";
        final String w = "010111";
        final String x = "101101";
        final String y = "101111";
        final String z = "101011";

        String[] Braille = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z};


        int sizeOfInput = si.length();
        StringBuilder result = new StringBuilder();

        for (int it = 0; it < sizeOfInput; it++) {
            char itch = si.charAt(it);

            if (Character.isUpperCase(itch)) {
                result.append(capital);
                char lowerchar = Character.toLowerCase(itch);
                int lowerascii = lowerchar;
                int diff = lowerascii - 97;
                result.append(Braille[diff]);
            } else if (Character.isLowerCase(itch)) {
                int lowerascii = itch;
                int diff = lowerascii - 97;
                result.append(Braille[diff]);
            } else if (itch == ' ') {
                result.append(space);
            }
        }

        return result.toString();
    }
}
