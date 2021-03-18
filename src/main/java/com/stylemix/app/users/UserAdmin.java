package com.stylemix.app.users;

import java.util.ArrayList;

public class UserAdmin extends User {

    public UserAdmin() {
        name = "admin";
        password = "FlashGordon2020@";
        email = "skandyrov@gmail.com";
    }

    public UserAdmin(ArrayList<String> listParam) {
        super.email = listParam.get(0);
        super.name = listParam.get(1);
        super.password = listParam.get(2);
    }

    public UserAdmin(String name, String email, String password) {
        super.name = name;
        super.email = email;
        super.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
