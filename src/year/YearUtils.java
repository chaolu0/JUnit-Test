package year;

public class YearUtils {

    public static boolean isLeapYear(int y) {
        if (y % 400 == 0)
            return true;
        if (y % 4 == 0 && y % 100 != 0)
            return true;
        return false;
    }
}
