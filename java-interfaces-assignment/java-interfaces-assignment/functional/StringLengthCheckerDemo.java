package functional;

import java.util.function.Function;

public class StringLengthCheckerDemo {
    public static void main(String[] args) {
        int limit = 20;
        Function<String, Integer> lengthFn = s -> s == null ? 0 : s.length();
        String[] messages = {"Short msg", "This is a fairly long message exceeding limit"};
        for (String m : messages) {
            int len = lengthFn.apply(m);
            System.out.println('"' + m + '"' + " length = " + len + (len > limit ? " (EXCEEDS)" : " (OK)"));
        }
    }
}
