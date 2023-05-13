package com.sda.provider;

import com.sda.model.Address;
import com.sda.model.Role;
import com.sda.model.User;
import lombok.NoArgsConstructor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor
public class FileUserProvider implements UserProvider {

    private String filePath = "src/main/resources/users";

    public FileUserProvider(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Set<User> getAllUsers() {
        Set<User> users = Set.of();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            users = bufferedReader.lines().map(this::mapToUser).collect(Collectors.toSet());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    private User mapToUser(String userDataLine) {
        var dataStringArray = userDataLine.split(";");
        return User.builder()
                .firstName(dataStringArray[0])
                .lastName(dataStringArray[1])
                .login(dataStringArray[2])
                .email(dataStringArray[3])
                .password(dataStringArray[4])
                .adress(mapToAdress(dataStringArray))
                .role(mapToRole(dataStringArray))
                .build();
    }

    private Address mapToAdress(String[] dataStringArray) {
        return Address.builder()
                .street(dataStringArray[5])
                .buildingNo(dataStringArray[6])
                .apartmentNo(dataStringArray[7])
                .postalCode(dataStringArray[8])
                .build();
    }

    private List<Role> mapToRole(String[] dataStringArray) {
        return Arrays.stream(dataStringArray[9].split("/"))
                .map(Role::valueOf)
                .collect(Collectors.toList());
    }
}
