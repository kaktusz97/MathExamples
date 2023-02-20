package utils;

public class Util {

    private Util() {
    }

    public static boolean isBetween(int target, int lowerBound, int upperBound) {
        return target >= lowerBound && target <= upperBound;
    }
}
