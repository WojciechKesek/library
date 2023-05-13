package com.sda.provider;

import com.sda.UserDataFactory;
import com.sda.model.Address;
import com.sda.model.Role;
import com.sda.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

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