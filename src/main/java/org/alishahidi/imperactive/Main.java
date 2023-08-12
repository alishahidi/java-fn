package org.alishahidi.imperactive;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ali", Gender.MALE),
                new Person("Melika", Gender.FEMALE),
                new Person("Sara", Gender.FEMALE),
                new Person("Mohammad", Gender.MALE)
        );

        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender()))
                .forEach(System.out::println);
    }

    record Person(String name, Gender gender) {

        @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", gender=" + gender +
                        '}';
            }
        }

    enum Gender {
        MALE, FEMALE
    }
}
