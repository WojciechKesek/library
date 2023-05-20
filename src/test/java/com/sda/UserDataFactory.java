package com.sda;

import com.sda.model.Address;
import com.sda.model.Role;
import com.sda.model.User;

import java.util.List;
import java.util.Set;

public class UserDataFactory {

    private static final User USER1 = new User("Jan",
            "Nowak",
            "jano",
            "jano@gmail.com",
            "password123",
            new Address(
                    "Wiejska",
                    "16",
                    "",
                    "01-256"),
            List.of(Role.USER, Role.ADMIN)
    );
    private static final User USER2 = new User("Adam",
            "Kowalski",
            "adko",
            "adko@gmail.com",
            "password345",
            new Address(
                    "Inna",
                    "5",
                    "2",
                    "01-256"
            ),
            List.of(Role.USER)
    );

    private static final Set<User> EXAMPLE_USER_DATA = Set.of(USER1, USER2);

    public static Set<User> getExampleUserData() {
        return EXAMPLE_USER_DATA;
    }

    public static User getExampleSingleUser() {
        return USER1;
    }
}
