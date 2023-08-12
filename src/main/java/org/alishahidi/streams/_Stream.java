package org.alishahidi.streams;

import org.alishahidi.imperactive.Main;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ali", Gender.MALE),
                new Person("Melika", Gender.FEMALE),
                new Person("Sara", Gender.FEMALE),
                new Person("Mohammad", Gender.MALE)
        );

        Double a = 0.1 + 0.2;
        float a1 = 0.1f + 0.2f;

        System.out.println(a);
        System.out.println(a1);

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
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
