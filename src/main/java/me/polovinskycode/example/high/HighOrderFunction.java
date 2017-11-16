package me.polovinskycode.example.high;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class HighOrderFunction {

    public String processString(String target, Function<String, String> action) {
        return action.apply(target);
    }

    public static void main(String... args) {
        List<String> palavras = Arrays.asList("Diego", "Fernanda", "Bruno");
        HighOrderFunction h = new HighOrderFunction();
        palavras.forEach(s -> System.out.println(h.processString(s, t -> t.toLowerCase())));
    }
}
