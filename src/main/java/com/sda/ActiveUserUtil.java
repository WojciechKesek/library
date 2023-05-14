package com.sda;

import com.sda.model.User;

public class ActiveUserUtil {
    private static User activeUser;

    public static User getActiveUser() {
        return activeUser;
    }

    public static void setActiveUser(User user) {
        activeUser = user;
    }
}
