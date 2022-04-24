package racingcar.util;

public class CustomStringUtils {

    public static String[] stringSplitByComma(String input) {
        String[] strArr = input.split(",");

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].trim();
        }

        return strArr;
    }
}
