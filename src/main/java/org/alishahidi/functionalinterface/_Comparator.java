package org.alishahidi.functionalinterface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _Comparator {
    public static void main(String[] args) {
        Comparator<Customer> comparatorByAge = new Comparator<Customer>() {
            @Override
            public int compare(Customer customer, Customer t1) {
//                s => B
//                if(customer.age() > t1.age()){
//                    return 1;
//                }else if(customer.age() < t1.age()) {
//                    return -1;
//                }else{
//                    return 0;
//                }
//                B => s
                return t1.age().compareTo(customer.age());
            }
        };

        List<Customer> customers = new ArrayList<>(List.of(
                new Customer("Ali Shahidi", 19),
                new Customer("Mohammad", 24),
                new Customer("Navid", 12),
                new Customer("Sara", 33)
        ));

        customers.sort(comparatorByAge);

        System.out.println(customers);

        System.out.println("------------Students using Comparable-------------");

        List<Student> students = new ArrayList<>(List.of(
                new Student("Ali Shahidi", 19),
                new Student("Mohammad", 24),
                new Student("Navid", 12),
                new Student("Sara", 33)
        ));
        Collections.sort(students);
        System.out.println(students);
    }

    record Customer(String name, Integer age){}

    record Student(String name, Integer age) implements Comparable<Student> {
            @Override
            public int compareTo(Student student) {
                return age().compareTo(student.age());
            }
        }
}
