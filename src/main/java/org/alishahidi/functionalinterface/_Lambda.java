package org.alishahidi.functionalinterface;

public class _Lambda {
    public static void main(String[] args) {
        var hi = "sds";
        var number = 22;

        Foo foo = () -> System.out.println("HI");
        foo.method();

        Bar bar = string -> System.out.println("You give me: " + string);
        bar.method("Bear");
    }

    @FunctionalInterface
    interface Foo{
        void method();
    }

    @FunctionalInterface
    interface Bar{
        void method(String string);
    }
}
