package org.alishahidi.functionalinterface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        greetCustomer.accept(new Customer("Ali Shahidi", "211321"));
        greetCustomerPrivate.accept(new Customer("Ali Shahidi", "+1-234324-324"), true);
    }

    static BiConsumer<Customer, Boolean> greetCustomerPrivate = (customer, isPrivate) -> System.out.println(
            "Hello " + customer.getName() + ", thanks for registration phone number: " + (isPrivate ? customer.getPhone().substring(0, 4) + "*".repeat(customer.getPhone().length() - 2)  : customer.getPhone())
    );

    static Consumer<Customer> greetCustomer = customer -> System.out.println(
            "Hello " + customer.getName() + ", thanks for registration phone number: " + customer.getPhone()
    );

    @Getter
    @AllArgsConstructor
    @ToString
    static class Customer {
        private final String name;
        private final String phone;

    }
}
