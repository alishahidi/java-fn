package org.alishahidi.functionalinterface;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class _Predicate {
    public static void main(String[] args) {
        String number = "+989276233822";
        System.out.println(validateNumber.test(number));
    }

    static Predicate<String> validateNumber = number -> Pattern.compile("^(0|\\+98|0098)9(0[1-5]|[1-3]\\d|2[0-2]|98)\\d{7}$").matcher(number).matches();
}
