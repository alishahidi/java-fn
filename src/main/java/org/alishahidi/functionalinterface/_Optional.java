package org.alishahidi.functionalinterface;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.ofNullable(null);

        System.out.println(optionalString.get().length());
    }
}
