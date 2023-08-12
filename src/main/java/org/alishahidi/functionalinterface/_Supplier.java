package org.alishahidi.functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        String dbConnection = getDbConnection.get();
    }

    static Supplier<String> getDbConnection = () -> "jdbc://localhost:5432/users";
}
