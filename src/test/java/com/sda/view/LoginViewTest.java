package com.sda.view;


import com.sda.api.UserLoginData;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;


class LoginViewTest {

    private final UserLoginData exempleUserLoginData = new UserLoginData(
            "testUser",
            "testPassword"
    );

    @Test
    void shouldProvideUserLoginDataBasedOnScannerInput() throws FileNotFoundException {
        // given

        // when
        LoginView loginView = new LoginView(
                new File("src/test/resources/login_test_iput")
        );
        // then
        assertThat(loginView.getData()).isEqualTo(exempleUserLoginData);
    }

}