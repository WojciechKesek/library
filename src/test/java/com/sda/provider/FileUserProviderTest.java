package com.sda.provider;

import com.sda.UserDataFactory;
import com.sda.model.User;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class FileUserProviderTest {


    @Test
    void shouldProvideAndMapAllUssersFromFile() {
        // given
        UserProvider userProvider = new FileUserProvider("src/main/resources/users");
        // when
        Set<User> result = userProvider.getAllUsers();
        // then
        assertThat(result).containsAll(UserDataFactory.getExampleUserData());
    }

}