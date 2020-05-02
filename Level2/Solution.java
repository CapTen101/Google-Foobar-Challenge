public class Solution {
    public static String solution(long x, long y) {
        long IDx = (x * (x + 1)) / 2;
        for (long i = x, temp = 1; temp < y; i++, temp++) IDx += i;
        return String.valueOf(IDx);
    }
}
