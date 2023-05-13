package com.sda.view;

import com.sda.api.UserLoginData;
import com.sda.controller.LoginController;
import com.sda.controller.LoginControllerImpl;

import java.util.Optional;
import java.util.Scanner;

public class LoginView implements View {
    private Scanner scanner;
    private LoginController loginController;
    Optional<String> message;

    public LoginView() {
        this.scanner = new Scanner(System.in);
        this.loginController = new LoginControllerImpl();
        this.message = Optional.empty();
    }

    public LoginView(Optional<String> message) {
        this.message = message;
        this.scanner = new Scanner(System.in);
        this.loginController = new LoginControllerImpl();
    }

    @Override
    public void display() {
        loginController.login(getData()).display();
    }

    UserLoginData getData() {
        message.ifPresent(System.out::println);
        System.out.print("Podaj login: ");
        String login = scanner.nextLine();
        System.out.print("Podaj hasło: ");
        String password = scanner.nextLine();
        return new UserLoginData(login, password);
    }
}
