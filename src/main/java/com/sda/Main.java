package com.sda;


import com.sda.view.BooksByAuthorView;
import com.sda.view.LoginView;
import com.sda.view.View;

public class Main {

    public static void main(String[] args) {
        View booksView = new BooksByAuthorView();
        booksView.display();
        View view = new LoginView();
        view.display();

    }

    // TODO wyświetlanie opcji po kolei niezależnie od roli, uniwersalnie nie tylko dla menu,
    //  ale też ksiązek i użytkowników (typ generyczny)

}
